package codewarsQuestions.byUsingMapAndFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReducingExample {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(4,5,3,9);
        Integer sonuc = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println(sonuc);


    }


}
