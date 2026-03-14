package BitManipulation;

public class LC476_FindComplement {

        public int findComplement1(int num) {//brute force solution
            int mask = 1;

            while(mask <= num){
                mask <<= 1;
            }

            return (mask - 1) ^ num;
        }

        static int findComplement2(int num) {//optimal solution
            int mask = Integer.highestOneBit(num);
            mask = (mask << 1) - 1;
            return num ^ mask;
        }


        void main(){
            int n=5;
            System.out.println(findComplement1(n));
            System.out.println(findComplement2(n));
        }
}
