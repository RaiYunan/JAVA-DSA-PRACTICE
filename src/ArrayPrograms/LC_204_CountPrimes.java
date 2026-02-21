package ArrayPrograms;

public class LC_204_CountPrimes {

        static int countPrimes1(int n) {
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

    public int countPrimes2(int n) { //optimal solution
        if (n <= 2) return 0;

        boolean[] isComposite = new boolean[n];

        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) count++;
        }

        return count;
    }

        void main(){
            int n=10;
            System.out.println(countPrimes1(n));
            System.out.println(countPrimes2(n));
        }
}
