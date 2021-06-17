package com.gonzalo.barbershop.domain.error;

public class NotAuthorizatedException extends RuntimeException {

    public NotAuthorizatedException (String message) {
        super(message);
    }

    public NotAuthorizatedException (String message, Throwable cause) {
        super(message, cause);
    }
}
