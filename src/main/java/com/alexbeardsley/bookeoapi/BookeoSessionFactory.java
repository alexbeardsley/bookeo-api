package com.alexbeardsley.bookeoapi;

public class BookeoSessionFactory {
	private final String secretKey;
	
	public BookeoSessionFactory(String secretKey) {
		this.secretKey = secretKey;
	}

	public BookeoSession getSession(String apiKey) {
		//this should eventually get cached because creating a new Client in Jersey is expensive, but
		//swagger's generated ApiClient is not thread-safe
		return new BookeoSession(
			new BookeoApiClient(secretKey, apiKey)
		);
	}
}
