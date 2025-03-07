package codewarsQuestions;

import java.util.Arrays;

public class SimpleMath {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberProperty(25)));

    }
    public static boolean[] numberProperty(int n) {
        boolean condition1 = true;
        boolean condition2 = false;
        boolean condition3 = false;
        if (n <= 1) {
            condition1 = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    condition1 = false;
                    break;
                }
            }
        }
        if (n % 2 == 0) condition2 = true;
        if (n % 10 == 0) condition3 = true;

        return new boolean[]{condition1, condition2, condition3};

    }

}
