package Java_Math;

public class GCD_HCF_CN {
    public static int calcGCD(int n, int m){
        while(n >0 && m > 0){
            if(n>m) n = n % m;
            else m= m % n;
        }

        if(n == 0) return m;
        else return n;
    }

    public static void main(String[] args) {

        int n= 6;
        int m = 4;

        System.out.println(calcGCD(n, m));

    }
}
