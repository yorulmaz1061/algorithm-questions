package codewarsQuestions;

import java.util.*;

public class FollowThatSpy {
    public static void main(String[] args) {
        String[][] array = {{"USA", "BRA" }, {"JPN", "PHL" }, {"BRA", "UAE" }, {"UAE", "JPN" }};


    }

    public String findRoutes(String[][] routes) {
        Map<String, String> map = new HashMap<>();
        Set<String> stringSet = new HashSet<>();
        for (String[] pair : routes) {
            map.put(pair[0], pair[1]);
        }
        for (Map.Entry<String, String> entry:map.entrySet()){
            

        }
        return null;



    }

}
