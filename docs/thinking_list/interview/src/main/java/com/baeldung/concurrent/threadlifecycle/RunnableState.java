package com.baeldung.concurrent.threadlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableState implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(RunnableState.class);

    public static void main(String[] args) {
        Runnable runnable = new NewState();
        Thread thread = new Thread(runnable);
        thread.start();
        LOGGER.info(String.valueOf(thread.getState()));
    }

    @Override
    public void run() {
    }
}
