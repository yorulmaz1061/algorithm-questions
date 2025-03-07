package codewarsQuestions.byUsingMapAndFlatmap.flatmapExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase {
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john@gmail.com", Arrays.asList("2222", "1111")),
                new Customer(102, "smith@gmail.com", Arrays.asList("3333", "4444")),
                new Customer(103, "peter@gmail.com", Arrays.asList("5555", "6666"))
        ).collect(Collectors.toList());

    }
}

