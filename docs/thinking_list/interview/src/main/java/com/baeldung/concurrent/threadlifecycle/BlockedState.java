package com.baeldung.concurrent.threadlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockedState {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlockedState.class);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new DemoThreadB());
        Thread t2 = new Thread(new DemoThreadB());

        t1.start();
        t2.start();

        Thread.sleep(1000); // InterruptedException

        LOGGER.info(String.valueOf(t2.getState()));
        System.exit(0);
    }
}

class DemoThreadB implements Runnable {
    @Override
    public void run() {
        commonResource();
    }

    public static synchronized void commonResource() {
        while(true) {
            // Infinite loop to mimic heavy processing
            // 't1' won't leave this method
            // when 't2' try to enters this
        }
    }
}