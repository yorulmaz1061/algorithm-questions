package codewarsQuestions.lowLevel;


public class CorrectTheMistakes {
    public static void main(String[] args) {
        String sample="1F-RUDYARD K1PL1NG";
        System.out.println(correct(sample));


    }
    public static String correct(String string){
        /*for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)=='5') string = string.replace("5","S");
            if (string.charAt(i)=='0') string = string.replace("0","O");
            if (string.charAt(i)=='1') string = string.replace("1","I");
        }
        return string;*/
      //  return string.replace("5","S").replace("0", "O").replace("1","I");

        return string.codePoints().map(c -> c == '5' ? 'S' :
                        c == '0' ? 'O' :
                                c == '1' ? 'I' : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
