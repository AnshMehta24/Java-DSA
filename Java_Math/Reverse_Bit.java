package Java_Math;


public class Reverse_Bit {

    public static long reverseBits(long n) {

        long ReverseNum = 0;
        for (int i = 0; i < 32; i++) {
            ReverseNum <<= 1;
            ReverseNum = ReverseNum | (n & 1);
            n >>= 1;
        }
        return ReverseNum;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println("Number of digits in " + n + " is " + reverseBits(n));
    }
}
