package practiceWorld;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(getMissingNumber(arr));

    }

    public static int getMissingNumber(int[] arr) {
        int expectedMax=arr.length;
        int expectedSum=  (expectedMax*(expectedMax+1))/2;
        int actualSum=0;
        for (int i = 0; i < arr.length; i++) {
            actualSum+=1;
        }

    return   expectedSum-actualSum;
    }


}






