package org.scaler;

public class Immutability {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);

        Integer[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        arr[1] = 20;
        arr[3] = 30;
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        arr = new Integer[]{4, 5, 6};
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);

        String s = "Hello";
        System.out.println(s);
        char[] charArr = s.toCharArray();
        System.out.println(charArr);
        charArr[0] = 'h';
        System.out.println(charArr);
    }
}
