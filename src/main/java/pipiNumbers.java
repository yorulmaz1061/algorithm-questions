import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class pipiNumbers {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(pipi(number));
    }
    private static Map<Integer, BigInteger> cache = new HashMap<>();
    public static BigInteger pipi(int n) {
        if (!cache.containsKey(n)) {
            BigInteger result = BigInteger.valueOf(n);
            for (int i = 0; i < n; i++) {
                result = result.subtract(pipi(i));
                result = result.multiply(result);
            }
            cache.put(n, result);
        }
        return cache.get(n);
    }
}








