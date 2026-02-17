package StringPrograms;

public class LC_151_ReverseWordsInAtring {
    static String reverseWords1(String s) {

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

    static String reverseWords2(String s) {

        char[] arr = s.toCharArray();

        // 1) remove extra spaces
        int n = cleanSpaces(arr);

        // 2) reverse whole string
        reverse(arr, 0, n - 1);

        // 3) reverse each word
        reverseEachWord(arr, n);

        return new String(arr, 0, n);
    }


    // remove leading, trailing, multiple spaces
    static int cleanSpaces(char[] arr) {
        int i = 0, j = 0, n = arr.length;

        while (j < n) {

            while (j < n && arr[j] == ' ') j++;   // skip spaces

            while (j < n && arr[j] != ' ')        // copy word
                arr[i++] = arr[j++];

            while (j < n && arr[j] == ' ') j++;   // skip spaces

            if (j < n) arr[i++] = ' ';            // add single space
        }
        return i;
    }


    static void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }


    static void reverseEachWord(char[] arr, int n) {
        int start = 0, end = 0;

        while (start < n) {

            while (end < n && arr[end] != ' ') end++;

            reverse(arr, start, end - 1);

            start = end + 1;
            end = start;
        }
    }


    void main() {
        String s = "the sky is blur";
        System.out.println(reverseWords1(s));
        System.out.println(reverseWords2(s));
    }
}
