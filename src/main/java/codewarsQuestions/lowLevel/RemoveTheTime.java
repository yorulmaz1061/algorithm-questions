package codewarsQuestions.lowLevel;

public class RemoveTheTime {
    public static void main(String[] args) {
        String input = "Friday May 2, 7pm";
        System.out.println(shortenToDate(input));

    }

    public static String shortenToDate(String longDate) {
      /*  StringBuilder stringBuilder = new StringBuilder(longDate);
        return stringBuilder.substring(0, stringBuilder.lastIndexOf(","));*/
        return longDate.substring(0,longDate.lastIndexOf(","));

    }
}


