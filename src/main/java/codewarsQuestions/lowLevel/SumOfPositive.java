package codewarsQuestions.lowLevel;

import java.util.Arrays;

public class SumOfPositive {
    public static void main(String[] args) {
        int[]array={-1,-2,-3,-4,-5};
        System.out.println(sum(array));

    }
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(p->p>0).sum();


    }
}
