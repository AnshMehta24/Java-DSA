package Java_Math;

public class Palindrome_Num_CN_LC {
    public static boolean palindromeNumber(int n){
        int dup = n;
        int ReverseNum = 0;
        while(n>0){
            int lastDigit= n % 10;
            ReverseNum = (ReverseNum * 10) + lastDigit;
            n /= 10;

        }

        if(ReverseNum==dup) return true;
        else return false;
    }
    public static void main(String[] args) {

        int X = 121;

        System.out.println(palindromeNumber(X));

    }
}
