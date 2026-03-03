package BitManipulation;

public class LC2220_MinimumBitsFlips {
    static int minBitFlips1(int start,int goal){
        int steps=start^goal;
        int count=0;
        while(steps!=0){
            steps=steps&(steps-1);
            count++;

        }
        return count;
    }
    static int minBitFlips2(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;

        while (xor != 0) {
            count += xor & 1;  // check last bit
            xor >>= 1;         // shift right
        }

        return count;
    }
    void main(){
        int start1=10,goal1=7;
        System.out.printf("So %d steps is required to flip bits from %d to %d.\n",minBitFlips1(start1,goal1),start1,goal1);
        System.out.printf("So %d steps is required to flip bits from %d to %d.",minBitFlips2(start1,goal1),start1,goal1);
    }
}
