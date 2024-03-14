package Java_Pattern;

import java.util.Scanner;

public  class  Java_Pattern {

    public static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void print5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print7(int n) {
        for (int i=0; i <n; i++) {
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print8(int n) {
        for (int i =n; i > 0; i--) {
            //space
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }

            //star
                for(int j=0;j<2*i-1;j++){
                    System.out.print("*");
                }

            //space
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print9(int n) {
        for (int i=0; i <n; i++) {
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i =n; i > 0; i--) {
            //space
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }

            //space
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static  void print11(int n){
        int start = 1;
        for(int i=0;i<n;i++){
            if(i % 2 == 0) start=1;
            else start=0;

            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static  void print12(int n){
        int space = 2*(n-1);
        for(int i=1;i<=n;i++){
            //number
            for(int j =1 ; j<=i ;j++){
                System.out.print(j);
            }


            // spcae
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }


            //number
            for(int j =i ; j>=1 ;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }

    public static void print13(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum += 1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }

    public static void print14(int n){
        for(int i=0;i<n;i++){
           for(char j='A';j<='A'+i;j++){
               System.out.print(j+" ");
           }
            System.out.println();
        }
    }

    public static void print15(int n){
        for(int i=n;i>0;i--){
            for(char j='A';j<='A'+i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print16(int n) {
        for(char i = 'A' ; i<'A'+n;i++){
            for(char j= 'A';j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void print17(int n){
        for (int i=0; i <n; i++) {
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //char
          char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for(int j =1;j <= 2*i+1;j++){
                System.out.print(ch+" ");
                if(j <=breakpoint) ch++;
                else ch--;
            }

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print18(int n){
        int startChar = 'A'+n-1;
        for (int i = 0; i < n; i++) {
            char currentChar = (char) startChar;
            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar--;
            }
            System.out.println();
//            startChar--;
        }
    }

    public static void print19(int n){
        int iniSpace=0;
        for(int i=0;i<n;i++){
            //stars
            for(int j =1; j<=n-i;j++){
                System.out.print("*");
            }

            //spaces
            for(int j=0;j<iniSpace;j++){
                System.out.print(" ");
            }


            //stars
            for(int j =1; j<=n-i;j++){
                System.out.print("*");
            }
            iniSpace+=2;
            System.out.println();
        }
        iniSpace=8;
        for(int i=1;i<=n;i++){
            //stars
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }

            //spaces
            for(int j=0;j<iniSpace;j++){
                System.out.print(" ");
            }


            //stars
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            iniSpace-=2;
            System.out.println();
        }
    }

    public static void print20(int n){
        int spaces = 2*n - 2;
        for(int i = 1;i<=2*n-1;i++){

            int stars = i;

            if(i>n) stars = 2*n - i;

            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            for(int j = 1;j<=stars;j++){
                System.out.print("*");
            }

            System.out.println();
            if(i<n) spaces -=2;
            else spaces +=2;
        }
    }

    public static void print21(int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==0 || j ==0 || i == n-1 || j== n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j< 2*n-1;j++){
                int top = i;
                int bottom = j;
                int left = (2*n -2)-i;
                int right = (2*n -2 )-j;

                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n = sc.nextInt();
            print22(n);
        }
        sc.close();
    }
}