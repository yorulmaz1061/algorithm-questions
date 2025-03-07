package leetCodeQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//TOBE WORKED
public class CountAndSay {
    public static void main(String[] args) {
        int num = 3322251;
        System.out.println(countAndSay(num));


    }

    public static String countAndSay(int n) {
        Map<Integer, String> map = new HashMap<>();
         List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        List<String>sorted=new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            sorted.add(String.valueOf(list.get(i)));
        }




      /*  List<String>sortedAndMap=new ArrayList<>();
        for (int i = 0; i < sorted.size(); i++) {
            sortedAndMap.add(String.valueOf(map.get(i))+sorted.get(i));
        }*/

        return "ozan";

    }
}






