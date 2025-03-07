package codewarsQuestions.otherType;

public class Q7 {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));


    }
    public static boolean isNarcissistic(int number){
        int num=number;
        int numberOfDigits = (int) Math.log10(num)+1;
        int[] digitArray = new int[numberOfDigits];
        for (int i = numberOfDigits-1; i >=0 ; i--) {
            digitArray[i]=num % 10;
            num /=10;
        }
        int sum=0;
        for (int i = 0; i < digitArray.length; i++) {
            sum= sum + (int)Math.pow(digitArray[i],numberOfDigits);
        }
        if (number==sum) return true;

        return false;
    }
}
