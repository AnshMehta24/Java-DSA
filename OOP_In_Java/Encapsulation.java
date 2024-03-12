package OOP_In_Java;
//Abstraction

//Access Modifiers
//1) Public
//2) Private
//3) Protected
//4) Default

//abstract class Animal{
//    abstract void walk();
//}
//class Horse extends Animal{
//    public void walk(){
//        System.out.println("Walks on 4 legs");
//    }
//}
//
//class Chicken extends Animal{
//    public void walk(){
//        System.out.println("2 Legs");
//    }
//}

interface Animal {
     void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("4 Legs");
    }
}

public class Encapsulation {
    public static void main(String[] args) {

    }
}
