package BitManipulation;

public class LC190_ReverseBits {

        public int reverseBits(int n) {
            int result = 0;
            for (int i = 0; i < 32; i++) {
                result <<= 1;
                result |= (n & 1);
                n >>= 1;
            }
            return result;
        }
    void main(){
        System.out.println(reverseBits(123456));
    }
}
