package groupQuestions;

public class FindFactorial {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(calculateFactorial(number));
    }

    public static long calculateFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input cannot be negative number");
        }
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
