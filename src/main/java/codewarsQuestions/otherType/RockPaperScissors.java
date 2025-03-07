package codewarsQuestions.otherType;

public class RockPaperScissors {

    public static void main(String[] args) {
        System.out.println(rps("rock", "rock"));

    }

    public static String rps(String p1, String p2) {
        /*if (p1.equals(p2)) return "Draw!";
        if (p1.equals("rock") && p2.equals("scissors")) return  "Player 1 won!";
        if (p1.equals("rock") && p2.equals("paper")) return  "Player 2 won!";

        if (p1.equals("scissors") && p2.equals("rock")) return  "Player 2 won!";
        if (p1.equals("scissors") && p2.equals("paper")) return  "Player 1 won!";

        if (p1.equals("paper") && p2.equals("scissors")) return  "Player 2 won!";
        if (p1.equals("paper") && p2.equals("rock")) return  "Player 1 won!";
        return null;*/
        if(p1 == p2) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";
    }
}
