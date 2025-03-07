package codewarsQuestions.highLevel;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveExclamationMarks {
    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println(removeExclamationMarks(str));


    }

    static String removeExclamationMarks(String s) {
        /*char[] arr = s.toCharArray();
        String bucket="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!='!') bucket+=arr[i];
        }
        return bucket;*/
        // return s.replaceAll("!", "");
        return  Stream.of(s.split("")).filter(p->!p.equals("!")).collect(Collectors.joining());
    }

}



