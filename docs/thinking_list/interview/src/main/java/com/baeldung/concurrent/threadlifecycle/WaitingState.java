package com.baeldung.concurrent.threadlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaitingState implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(WaitingState.class);

    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new WaitingState());
        t1.start();
    }

    @Override
    public void run() {
        Thread t2 = new Thread(new DemoThreadWS());
        t2.start();

        try {
            t2.join();  // alt + enter
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.error("Thread interrupted", e);
            // e.printStackTrace();
        }
    }
}

class DemoThreadWS implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoThreadWS.class);

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // ?
            LOGGER.error("Thread interrupted", e);
            // e.printStackTrace();
        }

        LOGGER.info(String.valueOf(WaitingState.t1.getState()));
    }
}