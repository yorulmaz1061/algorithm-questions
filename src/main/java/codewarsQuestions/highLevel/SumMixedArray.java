package codewarsQuestions.highLevel;

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(5, "5")));
    }
    public static int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
        }
    }


