package someStream;

import java.util.stream.Stream;

public class ShortestWord {
    public static void main(String[] args) {
        String word="bitcoin take over the world maybe who knows perhaps";
        System.out.println(findShort(word));
    }
    public static int findShort(String s){
        return Stream.of(s.split(" ")).map(String::length).min(Integer::compareTo).get();


    }
}
