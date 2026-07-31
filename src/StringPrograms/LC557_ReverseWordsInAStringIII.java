package StringPrograms;

public class LC557_ReverseWordsInAStringIII {
    static String reverseWords(String s){
        String[] words=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder word=new StringBuilder(words[i]);
            ans.append(word.reverse());

            if(i!=words.length-1){
                ans.append(' ');
            }
        }
        return ans.toString();
    }
    void main() {
        System.out.println(reverseWords("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetno c
        System.out.println(reverseWords("Mr Ding"));                     // rM gniD
    }
}
