package codewarsQuestions.otherType;

public class Q3 {
    public static void main(String[] args) {
        int a=123;
        String str ="222";
        System.out.println(numberToString(a));
        System.out.println(stringToNumber(str));

    }
    public static String numberToString(int num){

        return  String.valueOf(num);


    }
    public static int stringToNumber(String str){
        return Integer.parseInt(str);
    }

}
