package BitManipulation;

public class LC1342_NumberOfStepsToReduceToZero {

        static int numberOfSteps(int num) {
            int count=0;
            while(num!=0){
                if((num%2)==0){
                    num=num/2;
                }else{
                    num--;
                }
                count++;
            }
            return count;
        }

    void main(){
        System.out.println(numberOfSteps(8));
    }
}
