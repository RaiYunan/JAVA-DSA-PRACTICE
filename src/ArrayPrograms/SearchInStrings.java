package ArrayPrograms;

import java.util.Scanner;

public class SearchInStrings {

    static boolean search(String str,char target){
        for (int i = 0; i < str.length();i++) {
            if(str.charAt(i)==target){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String str="Yunan";
        Scanner in=new Scanner(System.in);
        char target=in.next().charAt(0);
        System.out.println("target = " + search(str,target));

    }
}
