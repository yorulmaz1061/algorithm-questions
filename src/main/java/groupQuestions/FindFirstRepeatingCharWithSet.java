package groupQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingCharWithSet {
    //Find the first repeating char in a string"
    //Example: "Java Developer" --> output:a
    public static void main(String[] args) {
        String s = "Java Developer";
        System.out.println(firstRepeatingCh(s));

    }

    public static Character firstRepeatingCh(String str) {
        Set<Character> set = new HashSet<>();
        for (Character ch : str.toCharArray()) if (!set.add(ch)) return ch;
        return null;
    }

}
