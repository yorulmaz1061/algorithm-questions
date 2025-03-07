package codewarsQuestions.byUsingFilter;

import java.util.Arrays;

public class WellofIdeas {
    public static void main(String[] args) {
        String[] array = {"bad", "bad", "good", "good","good"};
        System.out.println(well(array));

    }

    public static String well(String[] x) {
        Long goodCount = Arrays.stream(x).filter(p -> p == "good").count();
        if (goodCount==1L || goodCount==2 ) return "Publish!";
        if (goodCount>=3L) return "I smell a series!";
        if (goodCount==0L) return "Fail!";
        return null;
    }
}
