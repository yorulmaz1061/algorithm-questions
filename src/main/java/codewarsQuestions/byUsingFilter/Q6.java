package codewarsQuestions.byUsingFilter;

public class Q6 {
    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'l'));


    }
    public static int strCount(String str, char letter) {
       long count = str.chars().filter(p->p==letter).count();
       int countInt= (int) count;
       return countInt;
    }
}

