package Stack;
import java.util.Stack;

public class LC150_EvaluateReversePolishNotation {

    //  O(n) time | O(n) space
    static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {
                int b = stack.pop(), a = stack.pop();
                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                }
            } else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }

    void main() {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));        // 9
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));       // 6
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"})); // 22
    }
}
