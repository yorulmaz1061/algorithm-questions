package groupQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfDigits {
    public static void main(String[] args) {
    int number = 12345;

        List<Character> arr = convertIntegerToChar(number);
        System.out.println(arr);


    }
    public static List<Character> convertIntegerToChar(int num) {
        List<Character> arr = new ArrayList<>();
        while (num != 0) {

            arr.add(0, (char) (num % 10 + '0'));
            num = num/10;
        }
        return arr;
    }



}
