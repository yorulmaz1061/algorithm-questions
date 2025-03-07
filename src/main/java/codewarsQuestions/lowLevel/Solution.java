package codewarsQuestions.lowLevel;

public class Solution {
    public static void main(String[] args) {
        String str="a-z";
        System.out.println(gimmeTheLetters(str));

    }
    public static String gimmeTheLetters(String s){
        String beginString = s.substring(0, 1);
        String endString = s.substring(s.length() - 1);
        char beginCh = beginString.charAt(0);
        char endCh = endString.charAt(0);
        String bucket = "";
        for (char i = beginCh; i <= endCh; i++) {
            bucket += i;
        }
        return bucket;
    }
}

