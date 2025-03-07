package codewarsQuestions.lowLevel;

import java.util.stream.IntStream;

public class SumOfSequence {
    public static void main(String[] args) {
        int start=1;
        int end=5;
        int step=1;
        System.out.println(sequenceSum(start, end, step));
    }
    public static int sequenceSum(int start, int end, int step) {
       int sum=0;
        for (int i = start; i <=end ; i+=step) {
            sum+=i;
        }
        return sum;
    }

}
