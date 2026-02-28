package BitManipulation;

public class LC220_MinimumBitsFlips {
    static int minBitFlips(int start,int goal){
        int steps=start^goal;
        int count=0;
        while(steps!=0){
            steps=steps&(steps-1);
            count++;

        }
        return count;
    }
    void main(){
        int start1=10,goal1=7;
        System.out.printf("So %d steps is required to flip bits from %d to %d.",minBitFlips(start1,goal1),start1,goal1);
    }
}
