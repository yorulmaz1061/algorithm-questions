package groupQuestions;

import java.util.HashMap;
import java.util.Map;

public class Duplicated {
    public static void main(String[] args) {
        String input = "aabBbcde";
                int result = countDuplicateAlphanumeric(input);
                System.out.println("Count of distinct characters that occur more than once: " + result);
            }

            public static int countDuplicateAlphanumeric(String input) {
                Map<Character, Integer> charCountMap = new HashMap<>();

                // Convert input to lowercase to make it case-insensitive
                input = input.toLowerCase();

                // Count occurrences of characters in the input string
                for (char c : input.toCharArray()) {
                    if (Character.isLetterOrDigit(c)) {
                        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
                    }
                }

                // Count characters that occur more than once
                int duplicateCount = 0;
                for (int count : charCountMap.values()) {
                    if (count > 1) {
                        duplicateCount++;
                    }
                }

                return duplicateCount;
            }
        }


