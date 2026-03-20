package StringPrograms;

public class LC1021_RemoveOuterParentheses {
    static String removeOuterParentheses1(String s) {

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

        static String removeOuterParentheses2(String s) { //stack based approach

            StringBuilder result = new StringBuilder();
            int start = 0;
            int balance = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '(') balance++;
                else balance--;


                if (balance == 0) {
                    result.append(s.substring(start + 1, i));
                    start = i + 1;
                }
            }

            return result.toString();

    }
    void main(){
        String s="(()())(())";
        System.out.println(removeOuterParentheses1(s));
        System.out.println(removeOuterParentheses2(s));
    }
}
