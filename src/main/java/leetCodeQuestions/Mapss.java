package leetCodeQuestions;


import java.util.HashMap;
import java.util.Map;

public class Mapss {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("ee",1);
        map.put("aa",2);
        System.out.println(map.containsKey("ee"));
        System.out.println(map.get("ee"));
    }
}
