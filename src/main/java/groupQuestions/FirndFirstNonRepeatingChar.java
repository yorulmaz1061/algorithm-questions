package groupQuestions;

import java.util.HashMap;

public class FirndFirstNonRepeatingChar {
    //Find the first non-repearing char in a String
    //Example: "Java Developer output:J
    public static void main(String[] args) {
        System.out.println(fistNonRepeating("Java Developer"));

    }

    public static Character fistNonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count;
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else map.put(ch, 1);
        }
        for (Character ch : str.toCharArray()) {
            if (map.get(ch) == 1) return ch;
        }
        return null;
    }
}