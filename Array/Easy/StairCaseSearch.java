package Array.Easy;

public class StairCaseSearch {

    public  static  boolean printStairCaseSearch(int matrix[][], int key){
      int row = matrix.length-1, col = 0;

      while (row < matrix.length && col >=0){
          if(matrix[row][col] == key){
              System.out.println("found key at (" + row + "," + col + ")");
              return true;
          }
          else if(matrix[row][col] > key){
              row--;
          }
          else{
              col++;
          }

      }
      return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};

        int key = 30;

        printStairCaseSearch(matrix, key);

    }
}
