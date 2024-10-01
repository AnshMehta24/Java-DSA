package SearchingInArray.SearchingInArray;

public class Two {
   public static void main(String args[]){
       int x =2;
       int n=5;
//       for(int i=n;i>0 ;i--){
//           for(int j=0;j<i;j++){
//               int asciA = 65;
//               System.out.print((char) (asciA + j) +" ");
//           }
//           System.out.println();
//       }
//       for(int i=0;i<n ;i++){
//            for(int j=0;j<=i;j++){
//                int asciA = 65;
//                System.out.print((char) (asciA + j) +" ");
//            }
//           System.out.println();
//       }

//       int asciA = 65;
//       for(int i=0;i<n ;i++){
//
//           for(int j=0;j<=i;j++){
//               System.out.print((char) (asciA) +" ");
//               asciA += 1;
//           }
//           System.out.println();
//       }


//int cot =1;
//       for(int i=0;i<n;i++){
//           for(int j=0;j<=i;j++){
//               System.out.print(cot);
//               cot+=1;
//           }
//           System.out.println();
//       }

       int c=4;
//       for(int i=0;i<n;i++){
//           for(int j=0;j<c;j++){
//               System.out.print("* ");
//           }
//           System.out.println();
//       }
//* * * *
//* * * *
//* * * *
//* * * *
//* * * *



        //* * * *
        //*     *
        //*     *
        //*     *
        //* * * *
//       for(int i=0;i<n;i++){
//           for(int j=1;j<=c;j++){
//               if(i== 0 || i== n-1){
//                   System.out.print("* ");
//               }else if(j == 1 || j == c){
//                   System.out.print("* ");
//               }else{
//                   System.out.print("  ");
//               }
//           }
//           System.out.println();
//       }


//* * * * *
//* * * *
//* * *
//* *
//*
//       for(int i=n;i>0;i--){
//           for(int j=0;j<i;j++){
//               System.out.print("* ");
//           }
//           System.out.println();
//       }

//        *
//      * *
//    * * *
//  * * * *
//* * * * *

//       for(int i=1;i<=n;i++){
//           for(int j=1;j<=n;j++){
//               if(j <= n-i){
//                   System.out.print("  ");
//               }else{
//                   System.out.print("* ");
//               }
//           }
//           System.out.println();
//       }




//       1
//       2 2
//       3 3 3
//       4 4 4 4
//       5 5 5 5 5
//       for(int i=1;i<=n;i++){
//           for(int j=1;j<=i;j++){
//               System.out.print(i +" ");
//           }
//           System.out.println();
//       }


//       1
//       2 3
//       4 5 6
//       7 8 9 10
//       11 12 13 14 15
//    int count =1;
//       for(int i=1;i<=n;i++){
//           for(int j=1;j<=i;j++){
//               System.out.print(count +" ");
//               count++;
//           }
//           System.out.println();
//       }



        //*                 *
        //* *             * *
        //* * *         * * *
        //* * * *     * * * *
        //* * * * * * * * * *
        //* * * *     * * * *
        //* * *         * * *
        //* *             * *
        //*                 *
//       int row =5;
//int col = 10;
//       for(int i=1;i<=row;i++){
//           for(int j=1;j<=i;j++){
//               System.out.print("* ");
//           }
//           int space = (row-i) *2;
//           for(int j=1;j<=space;j++){
//               System.out.print("  ");
//           }
//
//            for(int j=1;j<=i;j++){
//               System.out.print("* ");
//           }
//           System.out.println();
//       }
//       for(int i=row-1;i>0;i--){
//           for(int j=1;j<=i;j++){
//               System.out.print("* ");
//           }
//           int space = (row-i) *2;
//           for(int j=1;j<=space;j++){
//               System.out.print("  ");
//           }
//
//           for(int j=1;j<=i;j++){
//               System.out.print("* ");
//           }
//           System.out.println();
//       }



//       5 4 3 2 *
//       5 4 3 * 1
//       5 4 * 2 1
//       5 * 3 2 1
//       * 4 3 2 1
//       for(int i=1;i<=n;i++){
//           for(int j=n;j>0;j--){
//               if(j == i){
//                   System.out.print("* ");
//               }else{
//                   System.out.print(j+" ");
//               }
//
//           }
//           System.out.println();
//       }




//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
//       for(int i=1;i<=n;i++){
//        // space
//           for(int j=1;j<= n-i;j++){
//               System.out.print(" ");
//           }
//
//         // star
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//
////           // space
////           for(int j=1;j<= n-i;j++){
////               System.out.print("  ");
////           }
//
//           System.out.println();
//       }
//       for(int i=1;i<=n;i++){
//           // space
//           for(int j=1;j<= i;j++){
//               System.out.print(" ");
//           }
//
//           // star
//           for(int j=1;j<=n-i;j++){
//               System.out.print("* ");
//           }
//
//
////           // space
////           for(int j=1;j<= n-i;j++){
////               System.out.print("  ");
////           }
//
//           System.out.println();
//       }


        //     *
        //   *
        //  *
        // *
        //*



//*         *
// *       *
//  *     *
//   *   *
//    * *
//   *   *
//  *     *
// *       *
//*         *
//       for(int i=1;i<=n;i++){
//           for(int j=1;j<=n;j++){
//               if(j == i ){
//                   System.out.print("* ");
//               }else{
//                   System.out.print(" ");
//               }
//
//           }
//           for(int j=n;j>=i;j--){
//               if(j == i){
//                   System.out.print("* ");
//               }else{
//                   System.out.print(" ");
//               }
//
//           }
//           System.out.println();
//       }
//       for(int i=n-1;i>0;i--){
//           for(int j=1;j<=n;j++){
//               if(j == i){
//                   System.out.print("* ");
//               }else{
//                   System.out.print(" ");
//               }
//
//           }
//           for(int j=n;j>=i;j--){
//               if(j == i){
//                   System.out.print("* ");
//               }else{
//                   System.out.print(" ");
//               }
//
//           }
//           System.out.println();
//       }



            // *       *
            //  *   *
            //    *
            //  *   *
            //*       *
//       for(int i=1;i<=n;i++){
//           for(int j=1;j<=n;j++){
//               if(j == i || i+j == n+1){
//                   System.out.print("* ");
//               }else{
//                   System.out.print("  ");
//               }
//           }
//
//           System.out.println();



//    *
//   ***
//  *****
// *******
//*********
       // This is the outer loop which will loop for the rows.
//       for (int i = 0; i < n; i++)
//       {
//           // For printing the spaces before stars in each row
//           for (int j =0; j<n-i-1; j++)
//           {
//               System.out.print(" ");
//           }
//
//           // For printing the stars in each row
//           for(int j=0;j< 2*i+1;j++){
//
//               System.out.print("*");
//           }
//
//           // For printing the spaces after the stars in each row
//           for (int j =0; j<n-i-1; j++)
//           {
//               System.out.print(" ");
//           }
//
//           System.out.println();
//
//       }



//       1
//       01
//       101
//       0101
//       10101

//       int start =1;
//       for(int i=0;i<n;i++){
//            if(i%2 == 0) start = 1;
//            else start =0;
//
//            for(int j=0;j<=i;j++){
//                System.out.print(start);
//                start = 1 - start;
//            }
//
//           System.out.println();
//       }


   }
}
