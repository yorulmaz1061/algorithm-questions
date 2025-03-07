package leetCodeQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[]array={4,1,2,1,2};
        System.out.println(singleNumber(array));


    }
    public static int singleNumber(int[] nums){
        Map<Integer,Integer>map=new HashMap<>();
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                counter++;
                map.put(nums[i],counter+1);
            }else map.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if (entry.getValue().equals(1)) return entry.getKey();
        }
        return 0;

    }
}
