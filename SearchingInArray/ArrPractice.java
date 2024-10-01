package SearchingInArray.SearchingInArray;

public class ArrPractice {
    public static void main(String[] args) {
        //    1)Remove Duplicate from Array
//    Brute - Set tc= O(nlogn) + O(n) , sc= O(N)
//        int num[] = {1,3,2,5,6,3,1,5};
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<num.length;i++){
//            set.add(num[i]);
//        }
//
//        int j=0;
//        for(int n : set){
//            num[j] = n;
//            j++;
//        }
//        for(int i=0;i<set.size();i++){
//            System.out.print(num[i]);
//        }


//        2) find Second smallest element
//        int[] numbers = {5,2,8,3,1};
//        int min= Integer.MAX_VALUE;
//        int second_Mini = Integer.MAX_VALUE;
//
//        for(int i=0;i<numbers.length;i++){
//            if(numbers[i] < min ){
//                second_Mini = min;
//                min = numbers[i];
//            }else if(numbers[i] < second_Mini && numbers[i] != min){
//                second_Mini = numbers[i];
//            }
//        }
//
//        System.out.println(second_Mini);


//        3) Given 2 arrays WAP to  find common elements b/w them
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {4,5,6,7,8};
//
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr2.length;j++){
//                if(arr1[i] == arr2[j]){
//                    System.out.println(arr1[i]);
//                }
//            }
//        }


    }

}
