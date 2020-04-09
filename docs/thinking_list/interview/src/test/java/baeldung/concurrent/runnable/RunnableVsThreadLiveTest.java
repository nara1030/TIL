package baeldung.concurrent.runnable;

import org.apache.commons.lang3.RandomUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

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

    @Test
    public void givenARunnable_whenSubmitToES_thenResult() throws ExecutionException, InterruptedException {
        Future<?> future = executorService.submit(new SimpleRunnable(
                "SimpleRunnable executed using ExecutorService"
        ));
        future.get();
    }

    @Test
    public void givenARunnableLambda_whenSubmitToES_thenResult() throws ExecutionException, InterruptedException {
        executorService.submit(() ->
                LOGGER.info("Lambda runnable executed!!!")).get();
    }

    @Test
    public void givenAThread_whenRunIt_thenResult() throws InterruptedException {
        Thread thread = new SimpleThread("SimpleThread executed using Thread");
        thread.start();
        thread.join();
    }

    @Test
    public void givenAThread_whenSubmitToES_thenResult() throws ExecutionException, InterruptedException {
        executorService.submit(new SimpleThread(
                "SimpleThread executed using ExecutorService"
        )).get();
    }

    @Test
    public void givenACallable_whenSubmitToES_thenResult() throws ExecutionException, InterruptedException {
        Future<Integer> future = executorService.submit(
                new SimpleCallable()
        );
        LOGGER.info("Result from callable: {}", future.get());  // Test worker?
    }

    @Test
    public void givenACallableAsLambda_whenSubmitToES_thenResult() throws ExecutionException, InterruptedException {
        Future<Integer> future = executorService.submit(() ->
                RandomUtils.nextInt(0, 100));
        LOGGER.info("Result from callable: {}", future.get());
    }

    @AfterClass
    public static void tearDown() {
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdown();
        }
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

class SimpleCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return RandomUtils.nextInt(0, 100);
    }
}