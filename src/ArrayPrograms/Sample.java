package ArrayPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample {
    static boolean even(int count){
        if(count%2==0){
            return true;

        }
        return false;
    }
    static int findEvenNumbers(int[] nums){
        int count=0;
        int numberofDigits=0;
        for(int num:nums){
//            count=0;
//            while (num>0){
//                count++;
//                num=num/10;
//            }
            if(even(digits(num))){
                numberofDigits++;

            }

        }
        return numberofDigits;

    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] nums={123,325,-44,65,77};
        System.out.println(findEvenNumbers(nums));
//        System.out.println((digits(495845)));

    }

    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}
