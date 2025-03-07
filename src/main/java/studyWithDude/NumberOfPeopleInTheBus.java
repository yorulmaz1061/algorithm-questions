package studyWithDude;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        int numberOfPeopleInTheBus = 0;
        ArrayList<int[]> stop = new ArrayList<int[]>();
        stop.add(new int[]{10, 0});
        stop.add(new int[]{3, 5});
        stop.add(new int[]{2, 5});
        int sumZeros = stop.stream().mapToInt(x -> x[0]).sum();
        int sumOnes = stop.stream().mapToInt(x -> x[1]).sum();
        numberOfPeopleInTheBus = sumZeros - sumOnes;
        System.out.println(numberOfPeopleInTheBus);

    }

}
