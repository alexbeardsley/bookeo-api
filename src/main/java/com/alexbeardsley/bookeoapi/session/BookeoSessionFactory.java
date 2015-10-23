package com.alexbeardsley.bookeoapi.session;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.alexbeardsley.bookeoapi.request.TempCustomApiClient;

import generated.com.bookeo.api.request.ApiClient;

public class BookeoSessionFactory {
	protected static final String BASE_URL = "https://api.bookeo.com/v2";
	protected volatile Map<String, Optional<BookeoSession>> sessionCache = new HashMap<>();
	private String secretKey;
	
	public BookeoSessionFactory(String secretKey) {
		this.secretKey = secretKey;
	}

	public void registerNewApplication(String apiKey) {
		if (!sessionCache.containsKey(apiKey)) {
			synchronized (sessionCache) {
				if (!sessionCache.containsKey(apiKey)) {
					sessionCache.put(apiKey, Optional.empty());
				}
			}
		}
	}

	public BookeoSession getSession(String apiKey) {
		if (!isSessionCached(apiKey)) {
			synchronized (sessionCache) {
				// double checked lock for concurrency
				if (!isSessionCached(apiKey)) {
					ApiClient client = new TempCustomApiClient(secretKey, apiKey);
					client.setBasePath(BASE_URL);
					sessionCache.put(apiKey, Optional.of(new BookeoSession(client)));
				}
			}
		}
		return sessionCache.get(apiKey).get();
	}

	protected boolean isSessionCached(String apiKey) {
		return sessionCache.containsKey(apiKey)
				&& sessionCache.get(apiKey).isPresent();
	}
}
