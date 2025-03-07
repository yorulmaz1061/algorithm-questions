package someStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class WhatIsBetween {
    public static void main(String[] args) {
        int a=1;
        int b=4;
        System.out.println(Arrays.toString(between(a, b)));

    }
    public static int[] between(int a, int b){
        return  IntStream.rangeClosed(a,b).toArray();


    }
}
