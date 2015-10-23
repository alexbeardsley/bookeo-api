package com.alexbeardsley.bookeoapi.request;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.time.FastDateFormat;

import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.request.ApiException;
import generated.com.bookeo.api.request.Pair;
import generated.com.bookeo.api.request.TypeRef;
import generated.com.bookeo.api.request.auth.ApiKeyAuth;
import generated.com.bookeo.api.request.auth.Authentication;

public class TempCustomApiClient extends ApiClient {
	public TempCustomApiClient() {
		super();
	}
	
	public TempCustomApiClient(String secretKey, String apiKey) {
		super();
		setSecretKey(secretKey);
		setApplicationApiKey(apiKey);
	}
	
	
	
	private void setSecretKey(String key) {
		Authentication auth = super.getAuthentication("secret_key");
		((ApiKeyAuth) auth).setApiKey(key);
	}
	
	private String getSecretKey() {
		Authentication auth = super.getAuthentication("secret_key");
		return ((ApiKeyAuth) auth).getApiKey(); 
	}
	
	private void setApplicationApiKey(String key) {
		Authentication auth = super.getAuthentication("api_key");
		((ApiKeyAuth) auth).setApiKey(key);
	}
	
	private String getApiKey() {
		Authentication auth = super.getAuthentication("api_key");
		return ((ApiKeyAuth) auth).getApiKey();
	}
	
	@Override
	public String formatDate(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(date);
	}
	
	@Override
	public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames, TypeRef returnType) throws ApiException {
		boolean hasSecretKey = false, hasApiKey = false;
		for (int n = 0; n < authNames.length; n++) {
			if (authNames[n].equals("secret_key"))
				hasSecretKey = true;
			else if (authNames[n].equals("api_key"))
				hasApiKey = true;
		}
		if (!hasSecretKey) {
			authNames = Arrays.copyOf(authNames, authNames.length + 1);
			authNames[authNames.length - 1] = "secret_key";
			queryParams.add(new Pair("secretKey", getSecretKey()));
		}
		if (!hasApiKey) {
			authNames = Arrays.copyOf(authNames, authNames.length + 1);
			authNames[authNames.length - 1] = "api_key";
			queryParams.add(new Pair("apiKey", getApiKey()));
		}
		return super.invokeAPI(path, method, queryParams, body, headerParams, formParams, accept, contentType, authNames, returnType);
	}
}