package com.baeldung.concurrent.threadlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeWaitingState {
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeWaitingState.class);

    public static void main(String[] args) throws InterruptedException {
        DemoThread obj1 = new DemoThread();
        Thread t1 = new Thread(obj1);
        t1.start();

        // The following sleep will give enough time for ThreadScheduler
        // to start processing of thread t1
        Thread.sleep(1000); // InterruptedException
        LOGGER.info(String.valueOf(t1.getState()));
    }
}

class DemoThread implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoThread.class);

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.error("Thread interrupted {}", e);
        }
    }
}
