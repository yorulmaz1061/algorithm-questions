package codewarsQuestions.highLevel;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySquareUp {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(Arrays.toString(squareUp(num)));
    }

    public static int[] squareUp(int number) {
       /* int[] result = new int[number * number];
        int index = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j >= (number - i - 1)) {
                    result[index++] = number - j;
                } else {
                    result[index++] = 0;
                }
            }
        }
        return result;*/
        return IntStream.range(0,number)
                .flatMap( x -> IntStream.range(0,number).map( y -> y >= number-1-x ? number-y : 0 ))
                .toArray();

    }
}







