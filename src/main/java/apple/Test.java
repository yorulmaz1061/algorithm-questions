package apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers =new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6));
        numbers.stream().filter(p->p%2==0).limit(1).forEach(System.out::println);
        System.out.println("-------------");
        numbers.stream().limit(5).map(p->p+10).forEach(System.out::println);


    }

}
