import  java.util.*;
public class Array {
//    public static void Update(int marks[]){
//        for(int i=0;i<marks.length;i++){
//            marks[i] = marks[i] + 1;
//        }
//    }
//    public static int GerLargest(int numbers[]){
//        int Largest = Integer.MIN_VALUE;
//
//        for(int i=0;i<numbers.length;i++){
//            if(Largest < numbers[i]){
//                Largest = numbers[i];
//            }
//        }
//        return Largest;
//    }
//    public static int GetLowest(int numbers[]){
//        int Lowest = Integer.MAX_VALUE;
//
//        for(int i=0;i<numbers.length;i++){
//            if(Lowest > numbers[i]){
//                Lowest = numbers[i];
//            }
//        }
//        return Lowest;
//    }


    //Binary search
//    public static int Binarysearch(int numbers[], int key){
//        int start = 0;
//        int End = numbers.length - 1;
//        while (start<=End){
//            int mid = (start + End) / 2;
//
//            //Comparisons
//            if(numbers[mid]==key){
//                return mid;
//            }
//            if(numbers[mid]>key){
//                End=mid-1;
//            }
//            else {
//                start=mid+1;
//            }
//        }
//        return -1;
//    }

        // Reverse an Array
//    public static void Reversearr(int numbers[]){
//        int First=0, Last= numbers.length-1;
//        //Swap
//        while (First<Last){
//            int temp= numbers[Last];
//            numbers[Last]=numbers[First];
//            numbers[First]=temp;
//
//            First++;
//            Last--;
//        }
//    }

    //Pairs in An Array
//    public static void Pair(int numbers[]){
//        int tp=0;
//        for(int i=0;i< numbers.length;i++){
//            int curr = numbers[i];
//            for(int j=i+1;j< numbers.length;j++){
//                System.out.print(" ("+ curr + ","+ numbers[j] + ") ");
//                tp++;
//            }
//            System.out.println();
//        }
//        System.out.println("Total pairs : "+tp);
//    }

    //SubArray

    public static void Subarr(int numbers[]){
        int ts =0;
       int sum =0;
        int max_sum =0;
        int min_sum = max_sum;
        int prefix[] = new int[numbers.length];

        // calculate prefix
        prefix[0]=numbers[0];
        for(int i=1;i< numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int i=0;i< numbers.length;i++){
            int start = i;

            for(int j=i;j< numbers.length;j++){
                int end = j;

                sum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
 //                for(int k = start;k<=end;k++){
//
//                    System.out.print(numbers[k]+" ");
//                sum=sum + numbers[k];
//                    System.out.println(sum);

                }
                if(sum>max_sum){
                    max_sum = sum;
                }
//                if(sum<min_sum){
//                    min_sum=sum;
//                }
//                System.out.println(" ="+sum);
//                sum =0;
                ts++;
                System.out.println();
            }
//            System.out.println();
        System.out.println(max_sum);
        }
//        System.out.println(ts+"");
//        System.out.println("Maximum sum = "+max_sum);
//        System.out.println("Minimum sum = "+min_sum);

public static void kadane(int numbers[]){
        int max_sum=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i< numbers.length;i++){
        cs =  cs+ numbers[i];
        if(cs<0){
            cs=0;
        }
        max_sum = Math.max(cs,max_sum);
    }
    System.out.println(max_sum);
    }
    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers);
//        Subarr(numbers);
//        Pair(numbers);

//        Reversearr(numbers);
//        for(int i=0;i< numbers.length;i++){
//            System.out.print(numbers[i] + " ");
//        }
//        int key=100;
//        System.out.println("Binary Search " + Binarysearch(numbers, key));
//        System.out.println("Largest " + GerLargest(numbers));
//        System.out.println("Smalllest " + GetLowest(numbers));
//        Update(marks);
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Length of an array = " +marks.length);
//        int marks[] = new int[50];
//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//        marks[2] = sc.nextInt();
//
//        System.out.println("Phy :" +marks[0] +" Maths :" +marks[1]+ " Chemistry :" +marks[2]);
    }
}

