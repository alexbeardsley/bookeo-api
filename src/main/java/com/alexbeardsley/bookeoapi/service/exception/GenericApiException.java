package com.alexbeardsley.bookeoapi.service.exception;

/**
 * Created by alex.beardsley on 1/12/2016.
 */
public class GenericApiException extends RuntimeException {
    public GenericApiException() {
        super();
    }

    public GenericApiException(String message) {
        super(message);
    }

    public GenericApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericApiException(Throwable cause) {
        super(cause);
    }
}
