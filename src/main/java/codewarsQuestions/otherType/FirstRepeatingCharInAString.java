package codewarsQuestions.otherType;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class FirstRepeatingCharInAString {
    public static void main(String[] args) {
        String str="Java Developer";
        System.out.println(repeatingChar(str));

    }
    public static char repeatingChar(String str){
        Set<String>set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!set.add(String.valueOf(str.charAt(i)))) return str.charAt(i);

        }
        return ' ';
    }


}



