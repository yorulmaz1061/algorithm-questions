package leetCodeQuestions;

public class nnn {
    public static void main(String[] args) {
        int n = 10023;
        int sum=0;
        while (n > 0) {
            int a = n % 10;
            sum += a * a;
            System.out.println(a);
            n /= 10;
        }
    }
}
