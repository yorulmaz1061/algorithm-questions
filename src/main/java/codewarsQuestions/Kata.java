package codewarsQuestions;

public class Kata {
    public static void main(String[] args) {
        System.out.println(consecutiveDucks(16));

    }
    public static boolean consecutiveDucks(int n) {
        if (n < 2) return false;
        if (n % 2 == 1) return true;
        else {
            return consecutiveDucks(n / 2);
        }
    }

}
