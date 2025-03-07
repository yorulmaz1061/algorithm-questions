package someStream;

import java.util.Arrays;
import java.util.Objects;

public class HelpTheFruitGuys {
    public static void main(String[] args) {
        String[] basket = {null, null, "rottenApple", "rottenPineapple", "rottenKiwi" };
        System.out.println(Arrays.toString(removeRotten(basket)));
    }
    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null) return new String[0];
       return Arrays.stream(fruitBasket).filter(Objects::nonNull).map(p -> p.startsWith("rotten") ? p.substring(6) : p)
                .map(String::toLowerCase).toArray(String[]::new);
    }
}