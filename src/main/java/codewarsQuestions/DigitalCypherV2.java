package codewarsQuestions;

import java.util.HashMap;
import java.util.Map;

public class DigitalCypherV2 {

    ///DOES NOt WORK//
    public static void main(String[] args) {
        int[] array = {20, 12, 18, 30, 21};
        int key = 1939;
        System.out.println(decode(array, key));
    }
    public static String decode(int[] code, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        String keyLength = Integer.toString(key);
        int keyL = keyLength.length();
        int decoded=0;
        int indx=10;
        int bucket=0;

        for (int i = code.length-1; i>=0; i--) {
            for (int j = keyL-1; j >=0; j--) {
                decoded = code[i] - key / indx;
                indx=indx*10;
                bucket=bucket+decoded;
            }
            return stringBuilder.append((char)bucket).toString();
        }
        return null;
    }
}
