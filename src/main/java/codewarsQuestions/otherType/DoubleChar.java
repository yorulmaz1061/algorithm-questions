package codewarsQuestions.otherType;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class DoubleChar {
    public static void main(String[] args) {
        String word = "String";
        System.out.println(doubleChar(word));
    }
    public static String doubleChar(String s) {
   /*     StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append(s.charAt(i));
        }
        return sb.toString();*/
        return s.chars().mapToObj(c -> (char) c + "" + (char) c).collect(joining());
    }
}
