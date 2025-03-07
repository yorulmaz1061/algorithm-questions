import java.util.HashMap;
import java.util.Map;

public class IsUnique {
    public static void main(String[] args) {
        String s="Traaaannquila";
        char ch='a';
        System.out.println(isUnique(s, ch));
    }
    public static boolean isUnique(String str, char ch) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (map.get(ch) == 1) return true;

        }
        return false;
    }
}

