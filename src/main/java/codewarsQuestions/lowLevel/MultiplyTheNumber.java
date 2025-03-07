package codewarsQuestions.lowLevel;

public class MultiplyTheNumber {
    public static void main(String[] args) {
        System.out.println(multiply(15));
    }

    public static int multiply(int number) {
        int numberOfDigit = 0;
        numberOfDigit = number < 0 ? String.valueOf(number).length() - 1 : String.valueOf(number).length();
        int fiveTimesResult = (int) Math.pow(5, numberOfDigit);
        return (number * fiveTimesResult);
    }
}

