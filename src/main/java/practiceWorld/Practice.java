package practiceWorld;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
      Map<String, String> dataMap = new HashMap<>();
      dataMap.put("url", "qa3.vytrack.com");
      dataMap.put("username", "user66");
      dataMap.put("password", "abc66");
      dataMap.put("browser", "chrome");
      dataMap.put("truckdriver", "Bob");
      dataMap.put("storemanager", "John");

      System.out.println("++++KEYS++++");
     /* for(String key : dataMap.keySet() ) {
        System.out.println(key);} //returns all keys.



    }*/
      System.out.println(dataMap.keySet());
      System.out.println("------------");
      System.out.println(dataMap.values());
      System.out.println(dataMap.get(0));
      System.out.println("---------------");

      System.out.println(dataMap.entrySet());
      System.out.println(dataMap.entrySet().stream().filter(p -> p.getKey() == "browser").collect(Collectors.toSet()));

      Arrays.stream(DayOfWeek.values()).forEach(p-> System.out.println(p));


    }
}
