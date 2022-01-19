package com.applitools.eyes.exceptions;

import com.applitools.eyes.EyesException;

public class EyesRequestTimeoutException extends EyesException {
    public EyesRequestTimeoutException(String message) {
        super(message);
    }

    public EyesRequestTimeoutException(String message, Throwable e) {
        super(message, e);
    }
}
