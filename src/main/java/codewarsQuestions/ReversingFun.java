package codewarsQuestions;

import java.util.Arrays;
//to be studied//
public class ReversingFun {
    public static void main(String[] args) {
        String str = "012345";
        System.out.println(funReverse(str));

    }

    public static String funReverse(String s) {
        char[]array=s.toCharArray();
        Arrays.sort(array);
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }
}


