package codewarsQuestions;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] array={1,2,3};
        System.out.println(Arrays.toString(map(array)));

    }
    public static int[] map(int[] arr){
        int[] doubledArray= Arrays.stream(arr).map(p->p*2).toArray();
        return doubledArray;
    }

}
