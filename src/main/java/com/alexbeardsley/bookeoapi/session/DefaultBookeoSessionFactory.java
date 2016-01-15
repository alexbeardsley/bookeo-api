package com.alexbeardsley.bookeoapi.session;

/**
 * A simple factory to create sessions to interact with Bookeo's API.
 */
public class DefaultBookeoSessionFactory implements BookeoSessionFactory {
	private final String secretKey;

    /**
     * Creates a new factory using your application's private key.
     * @param secretKey the secret key for your application when registered with Bookeo
     */
    public DefaultBookeoSessionFactory(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * Gets a session used to interact with a specific Bookeo client.
     * @param apiKey the API key generated when the user authorizes your application to
     *               access their Bookeo instance
     * @return A session that will interact with a user's specific Bookeo instance
     */
	@Override
    public BookeoSession getSession(String apiKey) {
       return new BookeoSession(new BookeoApiClient(secretKey, apiKey));
    }
}
