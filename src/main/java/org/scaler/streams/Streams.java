package org.scaler.streams;

import java.util.ArrayList;
import java.util.Arrays;

public class Streams {

    public static void main(String[] args) {
        var intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Root Mean Square of intList
        var squares = new ArrayList<Integer>();
        for (var i : intList) {
            System.out.println("A: square : " + i);
            squares.add(i * i);
        }
        var sum = 0;
        for (var i : squares) {
            System.out.println("A: sum : " + i);
            sum += i;
        }
        var rms1 = Math.sqrt(sum / squares.size());


        // RMS using streams
        var ms = intList.stream()
                .peek(i -> System.out.println("B: square : " + i))
                .map(i -> i * i)
                .peek(i -> System.out.println("B: sum : " + i))
                .reduce(0, (a, b) -> a + b) / intList.size();
        var rms2 = Math.sqrt(ms);

    }
}
