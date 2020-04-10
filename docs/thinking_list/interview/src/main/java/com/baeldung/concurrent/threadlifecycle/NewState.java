package com.baeldung.concurrent.threadlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewState implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewState.class);

    public static void main(String[] args) {
        Runnable runnable = new NewState();
        Thread thread = new Thread(runnable);
        LOGGER.info(String.valueOf(thread.getState()));
    }

    @Override
    public void run() {
    }
}
