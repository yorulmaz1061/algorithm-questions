package codewarsQuestions.highLevel;

import java.util.Arrays;

public class PartsOfList {
    public static void main(String[] args) {
        String[] array = new String[]{"I", "wish", "I", "hadn't", "come"};
        System.out.println(Arrays.deepToString(partlist(array)));

        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(example(originalArray)));


    }


    public static String[][] partlist(String[] arr) {
        String[][] returnArray = new String[arr.length - 1][2];
        for (int i = 0; i < arr.length - 1; i++) {
            returnArray[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i + 1));
            returnArray[i][1] = String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length));
        }

        return returnArray;
    }

    public static int[] example(int[] originalArray) {

        int[] copiedArray = Arrays.copyOfRange(originalArray, 1, 4);

        return copiedArray;

    }
}


