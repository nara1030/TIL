package com.thisIsJava.concurrent.threadLifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        threadA.work = false;   // ThreadB만 실행

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        threadA.work = true;    // ThreadA, ThreadB 모두 실행

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        threadA.stop = true;    // 모두 종료
        threadB.stop = true;
    }
}

class ThreadA extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadA.class);

    public boolean stop = false;    // 종료 플래그
    public boolean work = true;     // 작업 진행 여부 플래그

    @Override
    public void run() {
        while (!stop) {
            if (work) {
                LOGGER.info("ThreadA 작업 내용");
            } else {
                Thread.yield(); // 다른 스레드에 실행 양보
            }
        }
        LOGGER.info("ThreadA 종료");
    }
}

class ThreadB extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadB.class);

    public boolean stop = false;    // 종료 플래그
    public boolean work = true;     // 작업 진행 여부 플래그

    @Override
    public void run() {
        while (!stop) {
            if (work) {
                LOGGER.info("ThreadB 작업 내용");
            } else {
                Thread.yield(); // 다른 스레드에 실행 양보
            }
        }
        LOGGER.info("ThreadB 종료");
    }
}
