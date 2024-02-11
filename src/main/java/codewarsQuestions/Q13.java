package codewarsQuestions;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(5, 25)));

    }

    public static int[] find(int base, int limit) {
        /*java.util.List<Integer> list = new java.util.ArrayList<>();
        int result=0;
        do {
            list.add(result);
            result += base;
        } while (result <= limit);
        list.remove(0);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i]=list.get(i);
        }
        return array;

         */
        int[] result = new int[limit / base];
        for (int i = base, n = 0;  i <= limit; i+= base, n++) {
            result[n] = i;}
        return result;
    }


}