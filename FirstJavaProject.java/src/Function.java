import java.util.Scanner;
public class Function {
    //Multiplicaton
//    public static int Product(int num1, int num2 ){
//        int p = num1 * num2;
//        return p;
//    }

    //Factorial
//    public static int Fact(int num1){
//        int s =1;
//        for(int i=num1;i>1;i--){
//            s=s*i;
//        }
//        return s;
//    }
//    public static int Binomial_Coefficient(int n1,int n2){
//        int a=Fact(n1);
//        int b=Fact(n2);
//        int c=Fact(n1 - n2);
//        int d = b*c;
//        int BC= a / d;
//        return BC;
//    }
//public static boolean isPrime(int n){
//    boolean isPrime=true;
//    for(int i=2; i<=n-1;i++){
//        if(n % i ==0){
//            isPrime=false;
//            break;
//        }
//    }
//    return isPrime;
//}
//public static void prime(int n){
//    for(int i=2; i<=n;i++){
//        if(isPrime(i)==true){
//            System.out.print(i+" ");
//        }
//
//    }
//    System.out.println();
//
//}
    public static   void BtoD(int B){
        int pow=0;
        int MyNum=B;
        int Decno=0;

        while(B > 0){
            int LastDigit= B % 10;
            Decno =Decno + (LastDigit * (int)Math.pow(2,pow));

            pow++;
            B=B /10;
        }
        System.out.println("Decimal of " + MyNum +" is " + Decno);
    }
    public  static  void DtoB(int D){
        int pow=0;
        int mynum =D;
        int Binary = 0;

        while (D>0){
            int rem=D % 2;
            Binary = Binary + (rem * (int)Math.pow(10, pow));

            pow++;
            D= D/2;
        }
        System.out.println("Binary of " + mynum +" is "+ Binary);
    }

    public static void main(String[] args) {
        BtoD(101);
//        prime(7);
        DtoB(5);
//        System.out.println("Enter N and R Value :");
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        int r=sc.nextInt();
//        int Binomial_coefficient=Binomial_Coefficient(n,r);
//        System.out.println("The Binommial Coefficient is :" + Binomial_coefficient);
//        int F=Fact(a);
//        System.out.println("Factorial is :" + F);
//        int b= sc.nextInt();
//        int Multi =Product( a , b);
//        System.out.println("Product is :" +Multi);

    }
}
