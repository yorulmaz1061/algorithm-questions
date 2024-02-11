package codewarsQuestions;

import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
    int[] arr={2,2,2,2};
        System.out.println(grow(arr));

    }
    public static int grow(int[] x){
       int res= Arrays.stream(x).reduce(1, (a,b)->a*b);
       return res;
    }

}
