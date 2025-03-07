package codewarsQuestions.byUsingMapAndFlatmap;

import java.util.Arrays;

public class Task {
    // given [1,2,3,4,5] return [1,4,9,16,25]

    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println(Arrays.toString(makeItSquare(array)));

    }
    public static int[]makeItSquare(int[]arr){
       return Arrays.stream(arr).map(p->p*p).toArray();
    }
}
