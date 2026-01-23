package BinarySearch;

public class Q6_SmallestLetterGreaterThanTarget {
    static char SmallLetter(char[] letters,char target){
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>=letters[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }

        return letters[start % letters.length];
    }
    public static void main(String[] args){

        char[] letters={'c','d','f','j','k','z'};
        char target='z';
        System.out.println(SmallLetter(letters,target));


    }
}
