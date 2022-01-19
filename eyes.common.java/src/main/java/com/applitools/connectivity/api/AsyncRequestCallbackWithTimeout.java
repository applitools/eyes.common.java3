package com.applitools.connectivity.api;

import com.applitools.eyes.exceptions.EyesRequestTimeoutException;

import java.util.Timer;
import java.util.TimerTask;

public abstract class AsyncRequestCallbackWithTimeout implements AsyncRequestCallback{
    private final Timer timeoutScheduler = new Timer("async callback timeout scheduler");
    protected final Object timeoutLock = new Object();
    private final String requestDescription;
    private static final int REQUEST_TIMEOUT_MS = 1000 * 60 * 2; // 2 minutes
    private boolean isFulfilled = false;

    public AsyncRequestCallbackWithTimeout(final String requestDescription) {

        this.requestDescription = requestDescription != null ? requestDescription : "[no description]";

        timeoutScheduler.schedule(new TimerTask() {
            @Override
            public void run() {
                onFail(new EyesRequestTimeoutException("Timeout occurred for request:" + requestDescription));
            }
        }, REQUEST_TIMEOUT_MS);

    }

    /**
     * Once fulfilled, additional calls to onComplete/fail will be silently discarded
     */
    public void markCallbackAsFulfilled() {
        timeoutScheduler.cancel();
        isFulfilled = true;
    }

    public boolean isFulfilled() {
        return isFulfilled;
    }
}
