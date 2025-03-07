package codewarsQuestions.highLevel;

public class VowelRemover {
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println(shortcut(word));

    }

    public static String shortcut(String input) {
       /* String bucket="";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)!='a'&& input.charAt(i)!='e'&& input.charAt(i)!='i' && input.charAt(i)!='u'&& input.charAt(i)!='o'){
                bucket+=input.charAt(i);
            }
        }
        return bucket;*/
        return input.replaceAll("[aeiou]", "");
    }

}
