package groupQuestions;

import java.util.Arrays;

public class FindMaxFromIntArray {
    public static void main(String[] args) {
        int[] array = {6,8,3,5,1,9};
        int maxValue = Arrays.stream(array).max().orElseThrow();
        System.out.println(maxValue);
        System.out.println("--------------------------");
        int max=0;
        for (int i=0; i<array.length; i++){
            if (array[i]>max) max=array[i];
        }
        System.out.println(max);



    }



}
