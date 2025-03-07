package codewarsQuestions.otherType;

import java.util.ArrayList;
import java.util.List;

public class ReversedStrings {
    public static void main(String[] args) {
        String str="world";
        System.out.println(solution(str));

    }
    public static String solution(String str){
      /*  String bucket="";
        for (int i = str.length()-1; i >=0 ; i--) {
            bucket+=str.charAt(i);
        }
        return bucket;*/
        return new StringBuilder(str).reverse().toString();
    }


}
