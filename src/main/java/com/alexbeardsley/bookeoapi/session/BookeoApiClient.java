package com.alexbeardsley.bookeoapi.session;

import com.bookeo.api.request.ApiClient;

import java.text.SimpleDateFormat;

public class BookeoApiClient extends ApiClient {
	protected final String BASE_URL = "https://api.bookeo.com/v2";
	protected final String BOOKEO_SECRET_KEY_HEADER = "X-Bookeo-secretKey";
	protected final String BOOKEO_API_KEY_HEADER = "X-Bookeo-apiKey";
	
	public BookeoApiClient(String secretKey, String apiKey) {
		super.setBasePath(BASE_URL);
		super.addDefaultHeader(BOOKEO_SECRET_KEY_HEADER, secretKey);
		super.addDefaultHeader(BOOKEO_API_KEY_HEADER, apiKey);
		super.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX"));
	}
}