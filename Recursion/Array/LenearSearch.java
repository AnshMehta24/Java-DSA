package Recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class LenearSearch {
    public static int linearSearch(int[] arr, int index, int target){
        if(arr.length - 1 == index && arr[index] != target){
            return  -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearch(arr, index +1, target);
    }

//    If there are multiple same target & you want to print all

    static  ArrayList<Integer> list = new ArrayList<>();
    public static void linearSearchAdvanced(int[] arr, int index, int target){
        if(arr.length - 1 == index && arr[index] != target){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        linearSearchAdvanced(arr, index +1, target);
      }


    public static ArrayList linearSearchArrayList(int[] arr, int index, int target, ArrayList<Integer> list){
        if(arr.length - 1 == index && arr[index] != target){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return linearSearchArrayList(arr, index +1, target, list);
    }

//  VVIMP:-  If you don't want to add an arrayList in the parameters
    public static ArrayList linearSearchArrayListAdvance(int[] arr, int index, int target){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return  list;
        }

//        This will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromAboveCalls = linearSearchArrayListAdvance(arr, index +1, target);

        list.addAll(ansFromAboveCalls);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,18,18,9};
        int target = 18;
//        System.out.println(linearSearch(arr, 0,target));
//
//        linearSearchAdvanced(arr, 0, target);
//        System.out.println(list);
//
//        System.out.println(linearSearchArrayList(arr, 0, target, new ArrayList<>()));

        System.out.println(linearSearchArrayListAdvance(arr, 0, target));
    }
}
