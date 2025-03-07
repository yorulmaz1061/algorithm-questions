package codewarsQuestions.byUsingFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RemovingElements {
    public static void main(String[] args) {
        Object[] arr = new Object[]{"Hello", "Goodbye", "Hello Again"};
        System.out.println(Arrays.toString(removeEveryOther(arr)));


    }

    public static Object[] removeEveryOther(Object[] arr) {
       /* List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                list.add(arr[i]);
            }

        }
        Object[] retArray = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            retArray[i] = list.get(i);
        }

        return retArray;*/
        return IntStream.range(0, arr.length).filter(n -> n % 2 == 0).mapToObj(i->arr[i]).toArray();


    }
}
