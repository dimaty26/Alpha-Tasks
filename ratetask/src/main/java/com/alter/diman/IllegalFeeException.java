package com.alter.diman;

public class IllegalFeeException extends RuntimeException {

    public IllegalFeeException() {
        super();
    }

    public IllegalFeeException(String message) {
        super(message);
    }

    public IllegalFeeException(Throwable cause) {
        super(cause);
    }
}
