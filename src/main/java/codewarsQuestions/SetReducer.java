package codewarsQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//to be worked
public class SetReducer {
    public static void main(String[] args) {
        int[] array={0, 4, 6, 8, 8, 8, 5, 5, 7};
        System.out.println(
                Arrays.toString(setReducer(array)));

    }

    public static int[] setReducer(int[] input){
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for (int i : input) {
            if (map.containsKey(i)) {
                count=map.get(i);
                map.put(i,count+1);
            }else map.put(i,1);
        }
        System.out.println(map);
        return map.values().stream().mapToInt(p->p).toArray();


    }
}

