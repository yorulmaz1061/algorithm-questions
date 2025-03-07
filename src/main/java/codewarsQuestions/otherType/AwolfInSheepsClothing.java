package codewarsQuestions.otherType;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AwolfInSheepsClothing {
    public static void main(String[] args) {
        String[] array = {"sheep", "sheep", "sheep", "wolf"};
        System.out.println(warnTheSheep(array));


    }

    public static String warnTheSheep(String[] array) {
        int dangerSheepNumber = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[array.length - 1] == "wolf") {
                return "Pls go away and stop eating my sheep";
            }
            if (array[i] == "wolf") {
                dangerSheepNumber = (array.length - 1) - i;
            }
        }

        return "Oi! Sheep number " + dangerSheepNumber + "!.You are about to be eaten by a wolf! ";
    }
}
