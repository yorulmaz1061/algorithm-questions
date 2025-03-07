package practiceWorld;

public class FactorialCalculation {
    public static void main(String[] args) {
        int number = 6;
        int factorial = calculateFactorial(number);
        System.out.println(factorial);
    }

    public static int calculateFactorial(int num) {
        int factorial=1;
        for (int i = 1; i<=num ; i++) {
            factorial=factorial*i;

        }

    return factorial;
    }
}

