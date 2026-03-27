package StringPrograms;

public class FindLargestOddNumber {
    public static String largestOddNumber(String num) {
        // Traverse from right to left to find the last odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 != 0) {
                // Return substring from start to this index
                return num.substring(0, i + 1);
            }
        }
        // No odd number found
        return "";
    }
    static String largestOddNumberBruteForce(String num){
        String ans="";
        for(int i=0;i<num.length();i++){
            String temp=num.substring(0,i+1);
            char lastChar=temp.charAt(temp.length()-1);

            if((lastChar-'0')%2!=0){
                ans=temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String num1 = "52";
        String num2 = "4206";
        String num3 = "35427";

        System.out.println(largestOddNumber(num1)); // Output: 5
        System.out.println(largestOddNumber(num2)); // Output: (empty string)
        System.out.println(largestOddNumber(num3)); // Output: 35427
        System.out.println(largestOddNumberBruteForce(num3));
    }
}
