package codewarsQuestions.highLevel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedWords {
    public static void main(String[] args) {
        String str = "row row row your boat";
        System.out.println(reverseWords(str));


    }

    public static String reverseWords(String str) {
        String[] array = str.split(" ");
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        String otherString = String.join(" ",array);
        return otherString;


//        List<String> Words = Arrays.asList(str.split(" "));
//        Collections.reverse(Words);
//        return String.join(" ", Words);

    }
}
