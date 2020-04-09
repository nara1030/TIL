package baeldung.concurrent.runnable;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableVsThreadLiveTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RunnableVsThreadLiveTest.class);   // Class별 로그?

    private static ExecutorService executorService;

    @BeforeClass
    public static void setup() {
        executorService = Executors.newCachedThreadPool();
    }

    @Test
    public void givenARunnable_whenRunIt_thenResult() throws InterruptedException {
        Thread thread = new Thread(new SimpleRunnable(
                "Simple Runnable executed using Thread"
        ));
        thread.start();
        thread.join();  // InterruptedException
    }
}

class SimpleThread extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleThread.class);

    private String message;

    SimpleThread(String message) {
        this.message = message;
    }

    @Override
    public void run() { // Optional
        LOGGER.info(message);
    }
}

class SimpleRunnable implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleRunnable.class);

    private String message;

    SimpleRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() { // Mandatory
        LOGGER.info(message);
    }
}

//class SimpleCallable implements Callable<Integer> {
//    @Override
//    public Integer call() throws Exception {
//        return
//    }
//}