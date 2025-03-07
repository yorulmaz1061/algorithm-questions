package codewarsQuestions.byUsingMapAndFlatmap;

import java.util.*;

import static java.util.Arrays.stream;

public class ProductOfMaxArray {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{8, 10, 9, 7}, 3));
    }

    public static long maxProduct(int[] numbers, int sub_size) {
        /*ist<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(i, numbers[i]);
        }
        list.sort(Comparator.reverseOrder());
        long bucket = 1;
        for (int i = 0; i < sub_size; i++) {
            bucket *= list.get(i);
        }
        return bucket;*/

        return stream(numbers)
                .sorted()
                .skip(numbers.length-sub_size)
                .mapToLong(Long::valueOf)
                .reduce(1, (x,y)->x*y);

    }
}

