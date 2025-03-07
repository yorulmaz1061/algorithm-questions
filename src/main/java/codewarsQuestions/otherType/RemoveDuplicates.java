package codewarsQuestions.otherType;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));

    }
    public static List<Object> removeDuplicates(int[] nums) {
        int size = nums.length;
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        list= list.stream().distinct().collect(Collectors.toList());
        int size2 = list.size();
        int neededUnderscore = size - size2;

        for (int i = 0; i <= neededUnderscore; i++) {
            list.add("_");
        }

        return list;

    }


}
