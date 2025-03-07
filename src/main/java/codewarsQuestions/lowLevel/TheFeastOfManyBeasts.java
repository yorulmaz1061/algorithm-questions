package codewarsQuestions.lowLevel;

public class TheFeastOfManyBeasts {
    public static void main(String[] args) {
        String animal = "great blue heron";
        String dish = "garlic nann";

        System.out.println(feast(animal, dish));

    }

    public static boolean feast(String beast, String dish) {

        char[] beastChar= beast.toCharArray();
        char[] dishChar = dish.toCharArray();
       /* if (beastChar[0]==dishChar[0] && beastChar[beastChar.length-1]==dishChar[dishChar.length-1]) return true;
        else return false;*/
        return beastChar[0] == dishChar[0] && beastChar[beast.length() - 1] == dishChar[dish.length() - 1];

    }

}


