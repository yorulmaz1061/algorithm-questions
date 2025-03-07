package codewarsQuestions.byUsingMapAndFlatmap;

import java.util.Arrays;
import java.util.List;

public class ExampleFlatMap {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Character> list2 = Arrays.asList('A', 'B');
        Object[] array = list1.stream().flatMap(p -> list2.stream().map(q -> List.of(p + " " + q)))
                .flatMap(List::stream).toArray();
        System.out.println(Arrays.toString(array));

    }

}
