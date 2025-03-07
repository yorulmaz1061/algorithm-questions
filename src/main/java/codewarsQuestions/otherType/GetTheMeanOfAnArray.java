package codewarsQuestions.otherType;

import java.util.Arrays;

public class GetTheMeanOfAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(getAverage(array));

    }

    public static int getAverage(int[] marks) {
    /*   return  Arrays.stream(marks).sum()/(int)Arrays.stream(marks).count();
    }*/
        return (int) Arrays.stream(marks).average().orElse(Double.NaN);
    }
}

