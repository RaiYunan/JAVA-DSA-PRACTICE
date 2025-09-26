package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxWealth {
    static int maxWealth(int[][] accounts){
        int[] arr=combinedWealth(accounts);
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        int rich=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                rich=i;
            }

        }
        rich=rich+1;
        System.out.println("The richest is person "+rich);
        return max;

    }
    static int[] combinedWealth(int[][] accounts){
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[accounts.length];
        int temp;
        for (int i = 0; i < accounts.length; i++) {
            temp=0;
            for(int j=0;j<accounts[i].length;j++){
                temp=temp+accounts[i][j];
            }
            list.add(temp);
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] accounts={{1,3},
                          {3,2},{7,8},{48,5}};
        System.out.println("He has "+maxWealth(accounts)+" wealth");
    }
}
