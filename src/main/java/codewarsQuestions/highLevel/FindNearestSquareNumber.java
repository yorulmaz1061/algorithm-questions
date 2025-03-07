package codewarsQuestions.highLevel;

public class FindNearestSquareNumber {
    public static void main(String[] args) {
        System.out.println(nearestSq(10));
    }

    public static int nearestSq(final int n) {
        //if you cast (int) Math.sqrt()--> value downs nearest squarenumber
       /* int sqrN = (int) Math.sqrt(n);
        int loweSq = sqrN * sqrN;
        int upperSq = (sqrN + 1) * (sqrN + 1);
        System.out.println((int) Math.sqrt(111));
        return (Math.abs(n - loweSq) <= Math.abs(n - upperSq)) ? loweSq : upperSq;*/
        int result = (int) Math.round(Math.sqrt(n));
        return  (int) Math.pow(result,2);

    }
}


