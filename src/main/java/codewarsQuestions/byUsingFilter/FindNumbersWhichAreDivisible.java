package codewarsQuestions.byUsingFilter;

import java.util.Arrays;

public class FindNumbersWhichAreDivisible {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(divisibleBy(array, 2)));


    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(p -> p % divider == 0).toArray();


    }

}

