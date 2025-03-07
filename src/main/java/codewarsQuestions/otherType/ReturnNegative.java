package codewarsQuestions.otherType;

import static java.lang.Math.abs;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(12));

    }
    public static int makeNegative(final int x){
       // return x>0 ? x*-1 : Math.min(x, 0);
        return -abs(x);

    }
}
