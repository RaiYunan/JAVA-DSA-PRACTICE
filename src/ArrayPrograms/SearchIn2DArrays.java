package ArrayPrograms;

import java.util.Arrays;

public class SearchIn2DArrays {
    static int[] Search(int[][] arr,int target){

        for (int i = 0; i <arr.length ; i++) {
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){

                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};

    }
    static int max(int[][] arr){
        int max=Integer.MAX_VALUE;
        int secMax=Integer.MAX_VALUE;
        for(int[] ints:arr){
            for(int anint:ints){
                if(anint>max){
                    max=anint;
                }
            }
        }
        for(int[] ints:arr){
            for(int anint:ints){
                if(anint>secMax && anint!=max ){
                    secMax=anint;
                }
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,15,69},
                     {7,8,-9}};
        System.out.println(max(arr));
//        int target=-9;
//        System.out.println(Arrays.toString(Search(arr,target)));


    }
}
