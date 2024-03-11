

import java.util.Scanner;
public class P1E3 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any Integer Value :");
        num=s.nextInt();
         for(int i=2;i<=num;i++)
         {
             while(num%i==0)
             {
                 num=num/i;
                 System.out.println(i);
                 System.out.println(",");
             }

         }

    }

}
