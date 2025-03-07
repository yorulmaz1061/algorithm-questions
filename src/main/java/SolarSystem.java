import java.util.ArrayList;
import java.util.List;


public class SolarSystem {
    public static void main(String[] args) {
        String[] arrays = {"Asteroid", "Asteroid", "Asteroid", "Earth", "Jupiter"};
        System.out.println(annotate(arrays));

    }

    public static char[] annotate(String[] celestailBodies) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < celestailBodies.length; i++) {
            if (celestailBodies[i].equals("Asteroid")) list.add(1);
            else if (celestailBodies[i].equals("Pluto")) list.add(2);
            else if (celestailBodies[i].equals("Mercury")) list.add(3);
            else if (celestailBodies[i].equals("Mars")) list.add(4);
            else if (celestailBodies[i].equals("Venus")) list.add(5);
            else if (celestailBodies[i].equals("Earth")) list.add(6);
            else if (celestailBodies[i].equals("Neptune")) list.add(7);
            else if (celestailBodies[i].equals("Uranus")) list.add(8);
            else if (celestailBodies[i].equals("Saturn")) list.add(9);
            else if (celestailBodies[i].equals("Jupiter")) list.add(10);
        }
        List<Character> characters = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) { // Start from index 1
            int prev = list.get(i - 1);
            int current = list.get(i);
            characters.add(current > prev ? '>' : current < prev ? '<' : '=');
        }
        char[] result = new char[characters.size()];
        for (int i = 0; i < characters.size(); i++) {
            result[i] = characters.get(i);
        }

        return result;



    }

}
