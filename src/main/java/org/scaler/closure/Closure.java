package org.scaler.closure;

public class Closure {

    static Runnable getRunnable(String name) {
        var greeting = "Hello";
        final int[] i = {1};
        var runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(greeting + i[0]++ + " " + name);
            }
        };
        return runnable;
    }

    public static void main(String[] args) {
        var r = getRunnable("Arnav");
        r.run();
        r.run();

        var r2 = getRunnable("Navdeep");
        r2.run();

    }
}
