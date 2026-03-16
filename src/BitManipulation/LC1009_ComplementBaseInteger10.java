package BitManipulation;

public class LC1009_ComplementBaseInteger10 {
    static int bitwiseComplement1(int n) {
        if(n == 0) return 1;

        int mask = 0;

        while(mask < n){
            mask = (mask << 1) | 1;
        }

        return n ^ mask;
    }
    static int bitwiseComplement2(int n){//same but cleaner approach
        if(n==0) return 1;
        int mask=Integer.highestOneBit(n);
        mask=(mask<<1)-1;
        return n^mask;
    }
    void main(){
        System.out.println(bitwiseComplement1(5)); //5=101; //output:2=010
        System.out.println(bitwiseComplement2(6));//6=110; output=> 001=1
    }
}
