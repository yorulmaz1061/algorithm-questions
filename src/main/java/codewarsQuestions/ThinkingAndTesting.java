package codewarsQuestions;


import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThinkingAndTesting {
    public static void main(String[] args) {
        String string="a";
        System.out.println(testSomethingCapitalized(string));

    }
    public static String testSomethingCapitalized(String s) {
        boolean flag=false;
        char[] array = s.toCharArray();
        for (char c : array) {
            if (c == ' ' || array.length==1) {
                flag = true;
                break;
            }
        }
        if(flag) return Stream.of(s).map(p -> p.toUpperCase(Locale.ROOT)).collect(Collectors.joining());
        else for (int i = 1; i < array.length; i++) {
            array[i]=Character.toUpperCase(array[i]);
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (char c : array) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
