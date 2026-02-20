package ArrayPrograms;

public class LC_204_CountPrimes {

        static int countPrimes(int n) {
            int count = 0;

            for(int i = 2; i < n; i++){
                if(isPrime(i)) count++;
            }
            return count;
        }

    static boolean isPrime(int num){
        if(num < 2) return false;

        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

        void main(){
            int n=10;
            System.out.println(countPrimes(n));
        }
}
