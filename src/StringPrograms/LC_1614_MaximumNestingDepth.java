package StringPrograms;

public class LC_1614_MaximumNestingDepth {

        static int maxDepth(String s) {
            int c = 0;
            int max = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    c++;
                }
                max = Math.max(c, max);
                if (ch == ')') {
                    c--;
                }
            }
            return max;
        }
            public static void main(String[] args){
                String s1="(1+(2*3)+((8)/4))+1";
                System.out.println(maxDepth(s1));
            }
    }

