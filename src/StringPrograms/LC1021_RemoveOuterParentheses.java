package StringPrograms;

public class LC1021_RemoveOuterParentheses {
    static String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (depth > 0) {
                    result.append(ch);  // not outer
                }
                depth++;
            }
            else { // ')'
                depth--;
                if (depth > 0) {
                    result.append(ch);  // not outer
                }
            }
        }

        return result.toString();
    }
    void main(){
        String s="(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}
