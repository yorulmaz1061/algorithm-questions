package codewarsQuestions.highLevel;



public class TotalPoints {
    public static void main(String[] args) {

        String[] games = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
        int sum = 0;

        for (String s : games) {
            char x = s.charAt(0);
            char y = s.charAt(2);

            sum += x > y ? 3 : x == y ? 1 : 0;
        }
        System.out.println(sum);
    }
}


