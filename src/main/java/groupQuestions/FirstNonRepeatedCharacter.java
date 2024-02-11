package groupQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharInAString("success"));

    }
    public static Character firstNonRepeatingCharInAString(String str){
        Map<Character, Integer> map = new HashMap<>();
        int count;

        for (Character each : str.toCharArray()){
            if (map.containsKey(each)){
                count = map.get(each);
                map.put(each, count+1);
            } else map.put(each,1);
        }
        // starting from string, check if the char count equals 1
        for (Character each:str.toCharArray()){
            if (map.get(each)==1) return each;
        }
        return null;
    }

}
