package codewarsQuestions.byUsingMapAndFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapImplementation {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world");
        // Mapping each word to a stream of its characters, and then flattening into a single stream
        Stream<Character> flatMappedStream = words.stream().flatMap(p -> p.chars().mapToObj(ch -> (char) ch));
        // Printing the characters of the flattened stream
        flatMappedStream.forEach(System.out::println);

    }
}


