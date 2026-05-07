package Strings;

public class LC8_StringToInteger {

    static int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1, result = 0;

        while (i < n && s.charAt(i) == ' ') i++;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            sign = (s.charAt(i++) == '-') ? -1 : 1;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    void main() {
        System.out.println(myAtoi("42"));                // 42
        System.out.println(myAtoi("   -042"));           // -42
        System.out.println(myAtoi("1337c0d3"));          // 1337
        System.out.println(myAtoi("0-1"));               // 0
        System.out.println(myAtoi("words and 987"));     // 0
        System.out.println(myAtoi("99999999999"));       // 2147483647 (MAX)
        System.out.println(myAtoi("-99999999999"));      // -2147483648 (MIN)
    }
}