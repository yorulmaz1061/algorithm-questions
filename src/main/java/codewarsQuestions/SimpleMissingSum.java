package codewarsQuestions;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.IntStream.of;

public class SimpleMissingSum {
    public static void main(String[] args) {
        int[] array = {2,3,2,3,4,2,12,3};
        System.out.println(solve(array));
    }
    public static int solve(int[] arr) {
       /* Arrays.sort(arr);
        int minSum=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>minSum) break;
            minSum+=arr[i];
        }
        return minSum;*/
        int[] sum = {1};
        of(arr).sorted().forEach(i -> sum[0] += i > sum[0] ? 0 : i);
        return sum[0];
    }
}

