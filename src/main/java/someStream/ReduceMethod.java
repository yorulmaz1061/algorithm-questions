package someStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMethod {
    public static void main(String[] args) {
        Integer sum = Stream.of(2, 4, 6, 9, 1, 3, 7).reduce(0, Integer::sum);
        System.out.println(sum);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 7, 8, 1, 5, 9));
        Integer toplam = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(toplam);
       int maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValue);

        List<String> wordList=Arrays.asList("spring","hibernate","corejava");
        String result = wordList.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(result);


    }


}
