package codewarsQuestions.otherType;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(sum(arr));
    }
    public static int sum(int[] numbers) {
        if ((numbers==null) || (numbers.length==0) || (numbers.length==1)) {
            return 0;
        }

        else{
            int max = java.util.Arrays.stream(numbers).max().getAsInt();
            int min = java.util.Arrays.stream(numbers).min().getAsInt();
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum = sum - (max + min);
        }

    }
}







