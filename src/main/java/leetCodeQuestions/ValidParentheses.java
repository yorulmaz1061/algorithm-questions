package leetCodeQuestions;


import java.util.Stack;
import java.util.stream.Stream;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{)";
        System.out.println(isValid(str));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (char c : array) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();


    }


}


