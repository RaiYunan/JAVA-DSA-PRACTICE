package StringPrograms;

public class RomanToInteger {
    static int romanToInt(String s) {

        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = values[s.charAt(i) - 'A'];

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args){

        System.out.println("III = " + romanToInt("III"));     // 3
        System.out.println("IV = " + romanToInt("IV"));       // 4
        System.out.println("IX = " + romanToInt("IX"));       // 9
        System.out.println("LVIII = " + romanToInt("LVIII")); // 58

    }
}
