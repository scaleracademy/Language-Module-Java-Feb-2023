package org.scaler.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadPrinting {
    /*
    Q: Write a program to print numbers from 1 to 100 using three threads.
        Any 2 consecutive numbers should not be printed by the same thread.
     */
    public static final int MAX = 100;

    public static void main(String[] args) {
        final AtomicInteger counter = new AtomicInteger(1);

        Runnable numberPrinter = new Runnable() {
            @Override
            public void run() {

                while(true) {
                    synchronized (counter) {
                        var i = counter.getAndIncrement();
                        if(i > MAX) {
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + " : " + i);
                        counter.notify();
                        try {
                            counter.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        };

        Thread t1 = new Thread(numberPrinter);
        Thread t2 = new Thread(numberPrinter);
        Thread t3 = new Thread(numberPrinter);

        t1.start();
        t2.start();
        t3.start();
    }
}
