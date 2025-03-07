package codewarsQuestions;

import java.util.Arrays;

public class EmailObfuscator {
    public static void main(String[] args) {
        System.out.println(obfuscate("test@123.com"));


    }

    public static String obfuscate(String email) {
        StringBuilder bucket= new StringBuilder();
        char[] array = email.toCharArray();
        for (char c : array) {
            if (c=='.'){
                bucket.append(" [dot] ");
                continue;
            }
            else if (c=='@'){
                bucket.append(" [at] ");
                continue;
            }
            bucket=bucket.append(c);
        }
        return bucket.toString();

    }


}

