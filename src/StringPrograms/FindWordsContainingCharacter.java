package StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    static List<Integer> findWordsContaining(String[] words,char x){
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=0;j<word.length();j++){
                if(word.charAt(j)==x){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        String[] arr={"leetcode","ecommerce"};
        char ch='r';
        System.out.println(findWordsContaining(arr,ch));
    }
}
