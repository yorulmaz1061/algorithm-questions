package groupQuestions;

public class Q1_AnimalFeast {
    public static void main(String[] args) {
        String animal="great blue heron";
        String dish= "garlic naan";
        System.out.println("is Animal Allowed: "+ isAnimalAllowed(animal,dish));

    }
    public static boolean isAnimalAllowed(String animal, String dish){

        return (animal.charAt(0)==dish.charAt(0)) && (animal.charAt(animal.length()-1)==dish.charAt(dish.length()-1));

    }
}
