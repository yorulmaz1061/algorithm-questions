package codewarsQuestions.otherType;

import java.util.Arrays;


public class Q10 {
    public static void main(String[] args) {
       System.out.println(Arrays.toString(monkeyCount(10)));
        //System.out.println(monkeyCount(10));

    }
    public static int[] monkeyCount(final int n){
        int[]array=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        return array;
    }

}
