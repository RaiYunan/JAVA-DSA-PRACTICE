package StringPrograms;

public class LC_58_LengthOfLastWord {

        static int lengthOfLastWord(String s) {
            // Start from the end to skip trailing spaces
            int length = 0;
            int i = s.length() - 1;

            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // Count characters of the last word
            while (i >= 0 && s.charAt(i) != ' ') {
                length++;
                i--;
            }

            return length;
        }

    public static void main(String[] args){
        System.out.print(lengthOfLastWord("Hello World"));
    }
}
