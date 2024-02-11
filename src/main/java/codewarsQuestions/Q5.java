package codewarsQuestions;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        double[] arr = {1, 5.2, 4, 0, -1};
        System.out.println(sum(arr));
    }

    public static double sum(double[] numbers) {
        /*double summ=0;
        for (int i = 0; i < numbers.length; i++) {
            summ+=numbers[i];
        }
        return summ;
    }*/
        return Arrays.stream(numbers).sum();
    }
}

