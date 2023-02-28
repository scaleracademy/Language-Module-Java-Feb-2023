package org.scaler.concurrency;

public class MultiThreadPrinting {
    /*
    Q: Write a program to print numbers from 1 to 100 using three threads.
        Any 2 consecutive numbers should not be printed by the same thread.
     */

    public static void main(String[] args) {

        Runnable numberPrinter = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
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
