import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T=500;
        System.out.println("! Please enter Your Marks out of 100 !");
        System.out.println("Enter 1st Subject Marks : ");
        int a=s.nextInt();
        if(a>100)
        {
            System.out.println("Wrong Input");
        }
        System.out.println("Enter 2nd Subject Marks : ");
        int b = s.nextInt();
        if(b>100)
        {
            System.out.println("Wrong Input");
        }
        System.out.println("Enter 3rd Subject Marks : ");
        int c = s.nextInt();
        if(c>100)
        {
            System.out.println("Wrong Input");
        }
        System.out.println("Enter 4th Subject Marks : ");
        int d = s.nextInt();
        if(d>100)
        {
            System.out.println("Wrong Input");
        }
        System.out.println("Enter 5th Subject Marks : ");
        int e = s.nextInt();
        if(e>100)
        {
            System.out.println("Wrong Input");
        }

        int sum = a +b + c + d +e;
        int Per = sum * 100 / T;

        System.out.print("Your Percentage is : ");
        System.out.println(Per);

    }
}
