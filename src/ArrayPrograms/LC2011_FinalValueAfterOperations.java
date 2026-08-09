package ArrayPrograms;

public class LC2011_FinalValueAfterOperations {

    /*
     * simulate increment/decrement operations on x
     * 1. check middle char of each operation string
     * 2. '+' means increment, '-' means decrement
     *
     * string simulation
     * O(n) time, O(1) space
     */
    static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+') x++;
            else                     x--;
        }
        return x;
    }

    void main() {
        System.out.println(finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));       // 1
        System.out.println(finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));       // 3
        System.out.println(finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"})); // 0
    }
}
