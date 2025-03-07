package codewarsQuestions.lowLevel;

public class CreditCardMask {
    public static void main(String[] args) {
        String str = "8907989870970979078";
        System.out.println(maskify(str));
    }
    public static String maskify(String str) {
      /*  if (str.length() > 4) {
            String last4digits = str.substring(str.length() - 4);
            int maskLenght = str.length() - last4digits.length();
            StringBuilder mask = new StringBuilder();
            for (int i = 0; i < maskLenght; i++) {
                mask.append('#');
            }
            return mask.append(last4digits).toString();
        } else return str;*/
        return str.length()<=4 ? str : str.substring(0,str.length()-4).replaceAll(".","#") + str.substring(str.length()-4);
    }

}
