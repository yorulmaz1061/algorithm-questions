package practiceWorld;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Input nums = [2,7,11,15], target = 9 Output = [0,1]  2 + 7 = 9;
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int potentialMatch = target - arr[i];
            if (map.containsKey(potentialMatch)) {
                return new int[]{i, map.get(potentialMatch)};
            } else map.put(arr[i], i);
        }
        return null;
    }

}


