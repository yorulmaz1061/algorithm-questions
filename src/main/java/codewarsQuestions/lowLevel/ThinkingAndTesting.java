package codewarsQuestions.lowLevel;

public class ThinkingAndTesting {
    public static void main(String[] args) {
        System.out.println(testAB(10, 20));
    }
    public static int testAB(int a, int b) {
        if (a == 0 && b == 1) {
            return a + b;
        }
        if (b == 2 * a) {
            return a + b;
        }
        if (b - a > 1) {
            return a * b;
        }
        if (a == b) {
            return a;
        }
        return a + b;
    }
}
