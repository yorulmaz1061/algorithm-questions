package codewarsQuestions.byUsingMapAndFlatmap;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);
        Object[] array= list1.stream().flatMap(p->list2.stream().map(q->List.of(p+" "+q)))
                .flatMap(List::stream).toArray();
        System.out.println(Arrays.toString(array));

    }
}
