import java.util.Scanner;
public class JAVA_strings_CH3 {
    //String is immutable it cannot be change
    public static void main(String[] args) {
       // String name = new String("Ansh");
        //String name = "Ansh";
        //System.out.println(name);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string : ");
        //String st = s.next();
        String st = s.nextLine();//for Whole Sentence
        System.out.println(st);
    }
}
