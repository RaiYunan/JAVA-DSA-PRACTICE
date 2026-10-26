package StringPrograms;

import java.util.Arrays;

public class LC443_StringCompression {

    // two pointer - O(n) time | O(1) space
    static int compress(char[] chars) {
        int write = 0, read = 0;
        while (read < chars.length) {
            char ch = chars[read];
            int start = read;
            while (read < chars.length && chars[read] == ch) read++;
            chars[write++] = ch;
            int count = read - start;
            if (count > 1)
                for (char digit : String.valueOf(count).toCharArray()) chars[write++] = digit;
        }
        return write;
    }

    void main() {
        char[] a = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(Arrays.toString(Arrays.copyOf(a, compress(a)))); // [a, 2, b, 2, c, 3]

        char[] b = {'a'};
        System.out.println(Arrays.toString(Arrays.copyOf(b, compress(b)))); // [a]

        char[] c = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(Arrays.toString(Arrays.copyOf(c, compress(c)))); // [a, b, 1, 2]
    }
}
