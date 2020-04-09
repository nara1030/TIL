package com.thisIsJava.concurrent.threadLifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class JoinExample {
    private static final Logger LOGGER = LoggerFactory.getLogger(JoinExample.class);

    public static void main(String[] args) {
        // Thread thread = new SumThread();     // 타입 불일치

        // new Thread(new SumThread()).start(); // 변수 재활용 불가
        SumThread sumThread = new SumThread();
        // getSum() 사용 위해 Runnable 타입이 아닌 SumThread 타입에 저장
        Thread thread = new Thread(sumThread);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
        }

        LOGGER.info("1~100 합: {}", sumThread.getSum());
    }
}

class SumThread implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(SumThread.class);

    private int sum;

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        // Stream<Integer>.iterate - ?
        sum = Stream.iterate(0, i -> i + 1)
                .limit(100)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
