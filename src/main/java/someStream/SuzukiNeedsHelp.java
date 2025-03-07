package someStream;

import java.util.Arrays;
import java.util.Comparator;

public class SuzukiNeedsHelp {
    public static void main(String[] args) {
        String str = "Tadashi Takahiro Takao Takashi Takayuki Takehiko Takeo Takeshi Takeshi";
        System.out.println(Arrays.toString(lineupStudents(str)));

    }

    public static String[] lineupStudents(String students) {
        String[] array = students.split(" ");
        return Arrays.stream(array)
                .sorted(Comparator.comparing(String::length).reversed().thenComparing(Comparator.reverseOrder()))
                .toArray(String[]::new);
       /* String[] arrayRetun=new String[array1.length];
        for (int i = 0; i < array1.length; i++) {
            arrayRetun[i]=String.valueOf(array1[i]);
        }
        return arrayRetun;*/
    }
}
