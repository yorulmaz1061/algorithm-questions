package codewarsQuestions.lowLevel;

import java.util.stream.Stream;

public class TripleDouble {
    public static void main(String[] args) {
        System.out.println(tripleTrouble("aa", "bb", "cc"));
    }

    public static String tripleTrouble(String one, String two, String three) {
       /* StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            stringBuilder.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return stringBuilder.toString();*/
        return java.util.stream.IntStream.range(0, one.length()).mapToObj(i->""+one.charAt(i)+two.charAt(i)+three.charAt(i)).collect(java.util.stream.Collectors.joining());

    }
}
