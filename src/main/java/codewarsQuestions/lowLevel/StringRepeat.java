package codewarsQuestions.lowLevel;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(5, "a"));

    }

    public static String repeatStr(final int repeat, final String string) {
       /* String returnString = "";
        for (int i = 0; i <repeat; i++) {
            returnString+=string;
        }
        return returnString;
        */
        return string.repeat(repeat);
    }
}


