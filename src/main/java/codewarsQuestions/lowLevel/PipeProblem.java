package codewarsQuestions.lowLevel;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PipeProblem {
    public static void main(String[] args) {
       int[]array={1,2,3,5,6,8,9};
        System.out.println(Arrays.toString(pipeFix(array)));

    }
    public static int[] pipeFix(int[] numbers){
        return IntStream.rangeClosed(numbers[0],numbers[numbers.length-1]).toArray();
    }
}
