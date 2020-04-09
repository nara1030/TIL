package com.baeldung.concurrent.threadlifecycle;

public class NewState implements Runnable {
    public static void main(String[] args) {
        Runnable runnable = new NewState();
        Thread thread = new Thread(runnable);
        System.out.println(thread.getState());
    }

    @Override
    public void run() {
    }
}
