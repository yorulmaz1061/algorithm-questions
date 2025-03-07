package leetCodeQuestions;

import java.util.*;
import java.util.stream.Stream;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int potentialMatch=0;
        Map<Integer,Integer>map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            potentialMatch = target - nums[i];
            if (map.containsKey(potentialMatch)){
                int[] returnArray = new int[]{i,map.get(potentialMatch)};
               return Arrays.stream(returnArray).sorted().toArray();
            } else map.put(nums[i],i);
        }
        return new int[]{};
    }


}




