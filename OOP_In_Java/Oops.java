

class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing with a " + this.color +" " +this.type);
    }
}

public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();

       pen1.color = "Red";
    pen1.type = "Ballpen";
        pen1.write();
    }
}
