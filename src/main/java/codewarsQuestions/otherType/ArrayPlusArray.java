package codewarsQuestions.otherType;

import java.util.Arrays;

public class ArrayPlusArray {
    public static void main(String[] args) {
        int res= arrayPlusArray(new int[]{-1,-2,-3}, new int[]{4,5,6});
        System.out.println(res);

    }
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
    /*    int[] sumArray = java.util.stream.IntStream.range(0, arr1.length)
                .map(i -> arr1[i] + arr2[i]).toArray();
       int result= (int) Arrays.stream(sumArray).sum();
       return result;
    }*/

    int arrSum = 0;
    for(int num : arr1) {
        arrSum += num;}
    for(int num : arr2) {
        arrSum += num;}
    return arrSum;
}

    }



