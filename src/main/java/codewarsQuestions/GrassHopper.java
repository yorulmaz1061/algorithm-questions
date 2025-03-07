package codewarsQuestions;

import java.util.Arrays;

public class GrassHopper {
    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        System.out.println(findAverage(arr));

    }
    public static int findAverage(int[] nums){
        int sum = Arrays.stream(nums).sum();
        long count = Arrays.stream(nums).count();

        return sum/(int)count;
    }
}
