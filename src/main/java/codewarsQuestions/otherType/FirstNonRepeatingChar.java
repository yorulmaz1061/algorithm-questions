package codewarsQuestions.otherType;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="Java Developer";
        System.out.println(firstNonRepeat(str));

    }
    public static Character firstNonRepeat(String str){
        Map<Character,Integer> map=new HashMap<>();
        int count=0;
       for (Character ch:str.toCharArray()){
           if (map.containsKey(ch)){
               count=map.get(ch);
               map.put(ch,count+1);
           } else map.put(ch,1);
       }
       for (Character ch:str.toCharArray()){
           if (map.get(ch)==1) return ch;
       }
       return null;
    }
}
