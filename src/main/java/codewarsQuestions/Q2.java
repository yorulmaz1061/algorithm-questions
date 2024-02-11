package codewarsQuestions;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] array = new int[]{9, 10, 19, 13, 19, 13};
        System.out.println(repeats(array));

    }

    public static int repeats(int[] arr) {
      /*  java.util.Set<Integer> uniqueElements = new HashSet<Integer>();
        java.util.Set<Integer> duplicateElements = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!uniqueElements.add(arr[i])) {
                duplicateElements.add(arr[i]);
            }
        }
        int sumDup=0;
        for (int i : duplicateElements){
            sumDup+=i;
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum-(2*sumDup);
    }*/
        int sum= 0;
        for (int i:arr){
            sum += i * (Arrays.stream(arr).filter(x->x==i).count()==1 ? 1:0);
        }
        return sum;
    }
}


