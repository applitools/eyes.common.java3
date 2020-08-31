package com.applitools.utils;

import com.applitools.eyes.Logger;

public class EyesSyncObject {

    private static final int WAIT_TIMEOUT = 60 * 1000;

    private boolean isNotified = false;
    private final Logger logger;
    private final String id;


    public EyesSyncObject(Logger logger, String id) {
        this.logger = logger;
        this.id = id;
    }

    public void waitForNotify() throws InterruptedException {
        if (isNotified) {
            return;
        }

        wait(WAIT_TIMEOUT);
        if (isNotified) {
            return;
        }

        logger.log(String.format("WARNING: Waiting for %d on object %s", WAIT_TIMEOUT, id));
        wait();
    }

    public void notifyObject() {
        isNotified = true;
        notify();
    }
}
