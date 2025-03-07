package codewarsQuestions.byUsingReduce;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PossibilitiesArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3};
        System.out.println(isAllPossibilities(arr));


    }

    public static boolean isAllPossibilities(int[] arg) {
        IntStream.rangeClosed(0,arg.length-1).mapToLong(p->p).reduce(0,(a,b)->a+b);


        return true;
    }
}
