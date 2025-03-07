package codewarsQuestions.highLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;
import static java.util.stream.IntStream.range;
import static java.util.stream.IntStream.rangeClosed;

public class RemovetheMinimum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 5, 1};
        System.out.println(Arrays.toString(removeSmallest(arr)));
    }

    public static int[] removeSmallest(int[] numbers) {
     //   int min = range(0, numbers.length).reduce((i, j) -> numbers[i] > numbers[j] ? j : i).getAsInt();
    //    return range(0, numbers.length).filter(i -> i != min).map(i -> numbers[i]).toArray();

        int smallestValue = stream(numbers).min().getAsInt();

        boolean foundSmallest = false;
        int[] result = new int[numbers.length - 1];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == smallestValue && !foundSmallest) {
                foundSmallest = true;
            } else {
                result[index++] = numbers[i];
            }
        }
        return result;

    }


}




