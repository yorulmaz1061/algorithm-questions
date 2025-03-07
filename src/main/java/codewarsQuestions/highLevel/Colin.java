package codewarsQuestions.highLevel;

public class Colin {
    public static void main(String[] args) {
        System.out.println(collinearity(1,1,6,1));


    }

    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        return x1 * y2 == y1 * x2;


    }
}

