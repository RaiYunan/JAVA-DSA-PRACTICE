package StringPrograms;

public class LC1945_SumOfDigitsAfterConvertingString {

    /*
     * given a string s and int k:
     * 1. convert each letter to its position (a=1, b=2, ... z=26)
     * 2. concatenate all numbers into one string
     * 3. sum all digits, repeat k times
     * 4. return final sum
     *
     * brute force: convert to string → sum digits k times
     * O(n*k) time, O(n) space
     */
    static int getLucky(String s,int k){
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c-'a'+1);

        }
        String num=sb.toString();

        while(k-->0){
            int sum=0;
            for(char c:num.toCharArray()){
                sum+=c-'0';
            }
            num=String.valueOf(sum);
        }
        return Integer.parseInt(num);
    }
    void main() {
        System.out.println(getLucky("iiii", 1));    // 36
        System.out.println(getLucky("leetcode", 2)); // 6
        System.out.println(getLucky("zbax", 2));     // 8
    }
}
