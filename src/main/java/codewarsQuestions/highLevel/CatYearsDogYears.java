package codewarsQuestions.highLevel;

import java.util.Arrays;

public class CatYearsDogYears {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ownedCatAndDog(21, 38)));


    }

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int humanYearsCat = 0;
        if (catYears >= 15 && catYears < 24) humanYearsCat = 1;
        if (catYears == 24) humanYearsCat = 2;
        if (catYears > 24) {
            int n = (catYears - 24) / 4;
            humanYearsCat = 2 + n;
        }
        int humanYearsDog = 0;
        if (dogYears >= 15 && dogYears < 24) humanYearsDog = 1;
        if (dogYears == 24) humanYearsDog = 2;
        if (dogYears > 24) {
            int m = (dogYears - 24) / 5;
            humanYearsDog = 2 + m;
        }
        return new int[]{humanYearsCat, humanYearsDog};
    }

}
