package StringPrograms;

public class LC415_AddStrings {
    static String addStrings1(String num1, String num2){
        //Most common two-pointer method.
        StringBuilder res=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int digit1=i>=0?num1.charAt(i)-'0':0; //charcodes :- '0'=48 '1'=49 and so on..
            int digit2=j>=0?num2.charAt(j)-'0':0;

            int sum=digit1+digit2+carry;

            carry=sum/10;
            res.append(sum%10);

            i--;
            j--;
        }
        return res.reverse().toString();
    }
    // Time: O(n)
// Space: O(n)

        static String addStrings2(String num1, String num2) {
            StringBuilder a = new StringBuilder(num1).reverse();
            StringBuilder b = new StringBuilder(num2).reverse();
            StringBuilder res = new StringBuilder();

            int carry = 0;
            int n = Math.max(a.length(), b.length());

            for(int i = 0; i < n; i++) {
                int d1 = i < a.length() ? a.charAt(i) - '0' : 0;
                int d2 = i < b.length() ? b.charAt(i) - '0' : 0;

                int sum = d1 + d2 + carry;
                res.append(sum % 10);
                carry = sum / 10;
            }

            if(carry != 0) res.append(carry);

            return res.reverse().toString();
        }


    public static void main(String[] args){
        String s1="123";
        String s2="177";
        System.out.println(addStrings1(s1,s2));
        System.out.println(addStrings2(s1,s2));

    }
}
