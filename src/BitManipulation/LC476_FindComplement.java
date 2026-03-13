package BitManipulation;

public class LC476_FindComplement {

        public int findComplement(int num) {
            int mask = 1;

            while(mask <= num){
                mask <<= 1;
            }

            return (mask - 1) ^ num;
        }

        void main(){
            int n=5;
            System.out.println(findComplement(n));
        }
}
