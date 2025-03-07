package someStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class IntStreamImplementation {
    public static void main(String[] args) {
        IntStream.range(1,11).forEach(System.out::println);
        IntStream.rangeClosed(1,30).forEach(System.out::println);

        double average = IntStream.of(10, 30, 50, 70, 90, 100).average().getAsDouble();

        System.out.println(average);





    }


}
