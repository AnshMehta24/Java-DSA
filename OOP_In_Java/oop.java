package OOP_In_Java;


class Pen{
    String color;
    String Type;

    public void write(){
        System.out.println("To Write Something");
    }

    public  void printColor(){
        System.out.println(this.color);
    }
}
class Student {
    String name;
    int age;

    public  void printInfo(String name){
        System.out.println(name);
    }
    public  void printInfo(int age){
        System.out.println(age);
    }
    public  void printInfo(String name, int age){
        System.out.println(name+ "+" + age);
    }


//    Student(){
//        System.out.println("Non-parameterized Constructor!");
//    }

//    Student(Student s2){
//        this.name = s2.name;
//        this.age = s2.age;
//        printInfo();
//    }
//    Student(){}
}
public class oop {
    public static void main(String[] args) {
//        Pen pen1 = new Pen();
//        pen1.color = "Blue";
//        pen1.Type = "Gel";

//        pen1.write();
//
//        pen1.printColor();

        Student s1 = new Student();

        s1.name = "Ansh";
        s1.age = 19;

        s1.printInfo(s1.age);
//
////        s1.printInfo();
//
//        Student s2 = new Student(s1);
//        s2.printInfo();
    }
}

