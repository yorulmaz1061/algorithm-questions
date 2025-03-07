package codewarsQuestions.highLevel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        /* Given an integer array nums, return true if any value appears at least twice in the array,
         and return false if every element is distinct.
        Example 1:
        Input: nums = [1,2,3,1]
        Output: true*/

        int[]array={1,2,3,1};
        System.out.println(containsDuplicate(array));

    }
    public static boolean containsDuplicate(int[] nums){
        Set<Integer>set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])){
                return true;
            }
        }
        return false;

    }

}
