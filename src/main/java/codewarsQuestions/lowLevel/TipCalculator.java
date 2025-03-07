package codewarsQuestions.lowLevel;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println(calculateTip(107.65, "great"));
    }
    public static Integer calculateTip(double amount, String rating){
       /* if (rating.equalsIgnoreCase("poor")) return (int) Math.ceil(amount*5/100);
        if (rating.equalsIgnoreCase("excellent")) return (int) Math.ceil(amount*2/10);
        if (rating.equalsIgnoreCase("good")) return (int) Math.ceil(amount*1/10);
        if (rating.equalsIgnoreCase("great")) return (int) Math.ceil(amount*15/100);
        if (rating.equalsIgnoreCase("terrible")) return (int) Math.ceil(amount*0/100);

        return null;*/
        switch (rating.toLowerCase()) {
            case "terrible":
                return 0;
            case "poor":
                return (int) (Math.ceil(0.05 * amount));
            case "good":
                return (int) (Math.ceil(0.1 * amount));
            case "great":
                return (int) (Math.ceil(0.15 * amount));
            case "excellent":
                return (int) (Math.ceil(0.20 * amount));
            default:
                return null;
        }
    }
}
