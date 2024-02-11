package groupQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
   /* Question-4 Frequency of Array Elements
    Write a function that takes a String array as parameter and returns a map object that
    contains each element of array as key and their occurrence counts as value.
    For calculating occurrence, array elements should be checked by regarding case sensitivity.
    Order is not important.
    EXAMPLE:
    Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
    Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}*/

    public static void main(String[] args) {
        System.out.println(stringTomap(new String[]{"Apple", "Banana", "apple", "Cherry", "Apple"}));


    }
    public static Map<String,Long> stringTomap(String[]array){
        Map<String, Long> collect = Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect = " + collect);
        return collect;
    }

}
