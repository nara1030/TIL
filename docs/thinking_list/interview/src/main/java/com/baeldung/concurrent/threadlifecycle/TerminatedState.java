package com.baeldung.concurrent.threadlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TerminatedState implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(TerminatedState.class);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new TerminatedState());
        t1.start();
        // The following sleep method will give enough time for
        // thread t1 to complete
        Thread.sleep(1000);
        LOGGER.info(String.valueOf(t1.getState()));
    }

    @Override
    public void run() {
    }
}
