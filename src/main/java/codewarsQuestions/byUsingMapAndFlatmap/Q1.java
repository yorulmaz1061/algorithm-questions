package codewarsQuestions.byUsingMapAndFlatmap;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,1,2,3};
        System.out.println(Arrays.toString(invert(arr)));


    }

    public static int[] invert(int[] array) {
      /*  for (int i = 0; i < array.length; i++) {
            array[i] = (array[i]*-1);
        }
        return array;*/
        return Arrays.stream(array).map(p->-p).toArray();
    }

}