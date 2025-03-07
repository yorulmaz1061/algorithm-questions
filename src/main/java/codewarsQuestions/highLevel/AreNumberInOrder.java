package codewarsQuestions.highLevel;

import java.util.Arrays;
import java.util.Collections;

public class AreNumberInOrder {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 19};
        System.out.println(isAscOrder(array));
    }

    public static boolean isAscOrder(int[] arr) {
     /*   for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;*/
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArr);

        return Arrays.equals(copyArr, arr);

    }
}
