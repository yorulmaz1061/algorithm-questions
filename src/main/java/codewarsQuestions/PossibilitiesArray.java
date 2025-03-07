package codewarsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibilitiesArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 0, 3};
        System.out.println(isAllPossibilities(array));


    }

    public static boolean isAllPossibilities(int[] arg) {
        if (arg == null) return false;
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(arg).sorted().boxed().toList();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.get(i)) continue;
            else return false;
        }
        return true;
    }


}

