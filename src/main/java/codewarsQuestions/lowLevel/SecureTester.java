package codewarsQuestions.lowLevel;

public class SecureTester {

    public static void main(String[] args) {

        System.out.println(alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));

    }

    public static boolean alphanumeric(String s) {
        if (s.contains(" ") || s.isEmpty() || s.length() == 1) return false;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if ((!Character.isLetterOrDigit(array[i]))|| array[i]>122) return false;
        }
        return true;
    }

}
