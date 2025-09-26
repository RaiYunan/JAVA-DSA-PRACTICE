package ArrayPrograms;

import java.util.Scanner;


public class SearchinRange {
    static boolean searchRange(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if(arr[i]==target){
                return true;
            }


        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number you want to search:");
        int num=in.nextInt();
        System.out.println(searchRange(arr,num));
    }
}
