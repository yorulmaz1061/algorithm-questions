package codewarsQuestions.lowLevel;

import java.util.Arrays;


public class StringJoinMethod {
    public static void main(String[] args) {
        String[] array={"Hello","world","from","Java"};
        String otherString = String.join(" ",array);
        System.out.println(otherString);
        String[] otherOtherString =otherString.split(" ");
        System.out.println(Arrays.toString(otherOtherString));
    }

}
