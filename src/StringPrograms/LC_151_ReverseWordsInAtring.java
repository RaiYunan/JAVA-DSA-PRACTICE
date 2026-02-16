package StringPrograms;

public class LC_151_ReverseWordsInAtring {
    static String reverseWords(String s) {

        s = s.trim();                   // remove leading/trailing spaces
        String[] words = s.split("\\s+");  // split by one or more spaces

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
    void main(){
        String s="the sky is blur";
        System.out.println(reverseWords(s));
    }
}
