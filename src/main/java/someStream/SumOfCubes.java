package someStream;


import java.util.stream.LongStream;

public class SumOfCubes {
    public static void main(String[] args) {
        long num= 3;
        System.out.println(sumCubes(3));
    }
    public static long sumCubes(long n){
        return LongStream.rangeClosed(1L,n).map(p->p*p*p).sum();

    }
}
