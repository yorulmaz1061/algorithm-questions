package leetCodeQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class HappyNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
      /*  if (n == 1) return true;
        if (n <= 4) return false;
        int cache = sum(n);
        while (cache > 4) {
            cache = sum(cache);
        }
        if (cache == 1) return true;
        return false;
    }

    public static int sum(int num) {
        String numStr = String.valueOf(num);
        return Arrays.stream(numStr.split("")).mapToInt(Integer::parseInt).map(p -> p * p).sum();
    }

}*/
        int sum=0;
        while(n>0){
            int a = n%10;
            sum += a*a;
            n /=10;
        } if(sum == 1){
            return true;
        }else if(sum == 4){
            return false;
        }
        return isHappy(sum);
    }
}

