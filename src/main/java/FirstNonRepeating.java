
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String input = "streSS";
        System.out.println(firstNonRepeatingLetter(input));

    }
    public static String firstNonRepeatingLetter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (Character c : s.toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                count = map.get(c);
                map.put(c, count + 1);
            } else map.put(c, 1);
        }
        String foundCh = "";
        for (Character c : s.toLowerCase().toCharArray()) {
            if (map.get(c) == 1) {
                foundCh = String.valueOf(c);
                break;
            }
        }
        for (Character c : s.toCharArray()) {
            if (foundCh==(String.valueOf(c))) {
                return foundCh;

            } else return foundCh.toUpperCase();
        }
        return "";
    }
}
