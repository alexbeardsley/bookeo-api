package com.alexbeardsley.bookeoapi;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bookeo.api.request.ApiClient;
import com.bookeo.api.request.ApiException;
import com.bookeo.api.request.Pair;
import com.bookeo.api.request.TypeRef;
import com.bookeo.api.request.auth.ApiKeyAuth;
import com.bookeo.api.request.auth.Authentication;

public class BookeoApiClient extends ApiClient {
	private static final String BASE_URL = "https://api.bookeo.com/v2";
	private static final String BOOKEO_SECRET_KEY_HEADER = "X-Bookeo-secretKey";
	private static final String BOOKEO_API_KEY_HEADER = "X-Bookeo-apiKey";
	
	public BookeoApiClient(String secretKey, String apiKey) {
		super.setBasePath(BASE_URL);
		super.addDefaultHeader(BOOKEO_SECRET_KEY_HEADER, secretKey);
		super.addDefaultHeader(BOOKEO_API_KEY_HEADER, apiKey);
	}
	
	@Override
	public String formatDate(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(date);
	}
}