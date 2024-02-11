package groupQuestions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
    /*Write a function that takes a String array as parameter and returns a map object that
    contains each element of array as key and their occurrence counts as value.
    For calculating occurrence, array elements should be checked by regarding case sensitivity.
    Order is not important.*/
    public static void main(String[] args) {
        String[] arr = {"apple", "Orange", "apple", "banana", "Orange", "grape"};
        Map<String, Integer> result = showMap(arr);

        for (Map.Entry<String, Integer> each : result.entrySet()) {
            System.out.println(each.getKey() + ": " + each.getValue());
        }

    }
        public static Map<String, Integer> showMap(String[] array) {

            Map<String, Integer> occurrenceMap = new HashMap<>();

            for (String each : array) {
                int count = occurrenceMap.getOrDefault(each, 0);

                occurrenceMap.put(each, count + 1);
            }

            return occurrenceMap;
        }



    }





