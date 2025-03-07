package leetCodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "MCMXC";
        System.out.println(romanToInt(str));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        int minusCountI = 0;
        int minusCountX = 0;
        int minusCountC = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1) {
                if (s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    minusCountI++;
                }
                if (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    minusCountX++;
                }
                if (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    minusCountC++;
                }
            }
            sum += map.get(s.charAt(i));
        }
        sum = sum - (minusCountI * 2) - (minusCountX * (2 * 10)) - (minusCountC * (2 * 100));
        return sum;
    }
}

