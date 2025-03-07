package leetCodeQuestions;

import java.util.Arrays;


public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] array = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(array));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String string1=strs[0];
        String string2=strs[strs.length-1];
        int countId=0;
        while (countId<string1.length() && countId<string2.length()){
            if (string1.charAt(countId)==string2.charAt(countId)) countId++;
            else break;
        }
        return string1.substring(0,countId);


    }
}
//once sortla sonra array sifiri ve sonu stringle
//int countid ata
//count her iki sting uzunlugundan kucuk oldugu surece
// her iki string in charAt countid leri esitse countid yi bir arttir
// degilse cik
//bir stringin baslangictan countid ye kadar substingini dondur.










