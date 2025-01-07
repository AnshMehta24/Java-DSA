package Recursion;

public class Pattern {

//    * * * *
//    * * *
//    * *
//    *
    public static void printStar(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("* ");
        printStar( row, col+1);
        }else{
            System.out.println();
            printStar(row -1, 0);
        }
    }

//    *
//    * *
//    * * *
//    * * * *
public static void printStar2(int row, int col){
    if(row == 0){
        return;
    }
    if(col < row){
        printStar2( row, col+1);
        System.out.print("* ");
    }else{
        printStar2(row -1, 0);
        System.out.println();
    }
}


    public static void main(String[] args) {
        int n = 4;
        printStar2(n, 0);
    }
}
