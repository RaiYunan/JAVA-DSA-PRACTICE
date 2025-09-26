package ArrayPrograms;

import java.util.Scanner;

public class LinearSearch {
    static int search(int[] arr,int target){
        if(arr.length==0){
            System.out.println("Array is empty...");

            return -1;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
              return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr={18,12,9,4,77,50,69};
        System.out.println("Which element do you want to search?");
        Scanner in=new Scanner(System.in);
        int target= in.nextInt();
        if(search(arr,target)<0){
            System.out.printf("%d does not exist in the array.",target);
        }else{
            System.out.printf("%d exists in the position %d in the array",target,search(arr,target)+1);
        }


    }
}
