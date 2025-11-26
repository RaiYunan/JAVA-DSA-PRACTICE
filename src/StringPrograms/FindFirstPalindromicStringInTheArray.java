package StringPrograms;

public class FindFirstPalindromicStringInTheArray {
    static String firstPalindrome(String[] words){
        for(String word:words){
            if(isPalindrome(word)){
                return word;
            }

        }
        return "";
    }

    static boolean isPalindrome(String word){
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(word.charAt(start)!=word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String[] arr1={"abc","car","ada","racecar","cool"};
        String[] arr2={"notapalindrome","racecar"};
        String[] arr3={"def","ghi"};
        System.out.println(firstPalindrome(arr1));
        System.out.println(firstPalindrome(arr2));
        System.out.println(firstPalindrome(arr3));
    }
}
