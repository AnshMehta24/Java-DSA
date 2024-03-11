import java.util.Scanner;

public class Practice {
    String name;
    int rollno;
    Practice(String s_name, int s_roll){
        System.out.println("Constructor Invoked");
        this.name=s_name;
        this.rollno=s_roll;

    }
    Practice(Practice s){
        System.out.println("Copy Constructor");
        this.name=s.name;
        this.rollno=s.rollno;

    }
    public void display(){
        System.out.println("name="+name);
        System.out.println(" rollno="+rollno);
    }

}
class Student{
    public static void main(String[] args) {
        Practice p=new Practice("GIT",007);
        Practice p2=new Practice(p);
        p.display();
        p2.display();
    }
}
