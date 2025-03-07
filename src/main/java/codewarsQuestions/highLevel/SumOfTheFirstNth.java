package codewarsQuestions.highLevel;


public class SumOfTheFirstNth {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));

    }
    public static String seriesSum(int n) {
        double sum = 0;
        //2->4;3->7;4->10
        for (int i = 1; i <= n; i++) {
            sum += 1.0/(1+3*(i-1));
        }
        String format =String.format("%.2f",sum);
        return String.valueOf(format);
    }
}


