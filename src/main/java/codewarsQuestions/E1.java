package codewarsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(1)));
    }
    public static long[] powersOfTwo(int n) {
        long[] array=new long[n];
        List<Long>list=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(i-1,(long)Math.pow(2,i+1));
        }
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}