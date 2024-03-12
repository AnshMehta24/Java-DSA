package OOP_In_Java;


//4 types
//1) Single lvl
//2) Multi lvl
//3) Hierarchial Inheritance
//4) Hybrid Inheritance

class Shape{
    String color;

    public void area(){
        System.out.println("area");
    }
}

class Triangle extends Shape{
    public  void area(int l , int h){
        System.out.println(1/2*l*h);
    }
}


class EquilateralTriangle extends  Shape{
    public void area(){

    }
}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Black";
//        System.out.println(t1.color);
    }
}
