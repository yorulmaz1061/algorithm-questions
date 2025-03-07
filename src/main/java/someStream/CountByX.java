package someStream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountByX {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1, 10)));


    }
    public static int[] countBy(int x,int n){
       //return   Stream.iterate(x, each -> each + x).limit(n).mapToInt(Integer::intValue).toArray();
        return IntStream.iterate(x, it -> it + x).limit(n).toArray();
    }


}
