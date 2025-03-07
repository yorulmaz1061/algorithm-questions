package codewarsQuestions.lowLevel;

import java.util.*;

public class RuinningOutOfSpace {
    public static void main(String[] args) {
        String[] array = {"i", "have", "no", "space"};
        System.out.println(Arrays.toString(spacey(array)));

    }

    public static String[] spacey(String[] array) {
        /*Map<Integer, String> map = new HashMap<>();
        String bucket = "";
        for (int i = 0; i < array.length; i++) {
            map.put(i, bucket + array[i]);
            bucket += array[i];
        }
        String[] returnString = new String[array.length];
        for (int i = 0; i < returnString.length; i++) {
            returnString[i] = map.get(i);
        }
        return returnString;*/
        List<String> result = new ArrayList<>();
        String words = "";
        for(String word : array) {
            words += word;
            result.add(words);
        }
        return result.toArray(array);



    }
}

