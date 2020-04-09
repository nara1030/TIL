package com.baeldung.concurrent.threadlifecycle;

public class RunnableState implements Runnable {
    public static void main(String[] args) {
        Runnable runnable = new NewState();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(thread.getState());
    }

    @Override
    public void run() {
    }
}
