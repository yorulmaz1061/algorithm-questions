package codewarsQuestions;

import java.util.Arrays;

public class KataExampleTwist {
    public static void main(String[] args) {

    }
    public static String[] kataExampleTwist()
    {
        String[] websites = {"codewars"};
        String[] websites1000=new String[websites.length*1000];
        Arrays.fill(websites1000, websites[0]);

        return websites1000;
    }

}
