package com.alexbeardsley.bookeoapi.session;

/**
 * Created by alex.beardsley on 1/12/2016.
 */
public interface BookeoSessionFactory {
    BookeoSession getSession(String apiKey);
}
