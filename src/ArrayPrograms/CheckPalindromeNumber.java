package ArrayPrograms;

public class CheckPalindromeNumber {
    static boolean checkPalindrome(int x){
        if (x < 0) return false;
        int real=x;
        int num=0;
        while(x>0){
            int rem=x%10;
            num=num*10+rem;
            x=x/10;
        }
        return real==num;

    }
    public static void main(String[] args){
        int num=121;
        System.out.println(checkPalindrome(num));
    }
}
