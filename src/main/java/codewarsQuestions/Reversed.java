package codewarsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
///DOES NOT WORK
public class Reversed {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(132530)));
    }
    public static int[] digitize(long n) {
        if (n==0L || n<0) return new int[]{0};
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add((int) n % 10);
            n /= 10;
        }

        int[]returnArray=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;
        }
    }






