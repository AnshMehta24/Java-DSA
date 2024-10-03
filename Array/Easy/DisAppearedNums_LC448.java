package Array.Easy;

import java.util.*;

//448. Find All Numbers Disappeared in an Array
//        Easy
//        Companies : Google
//        Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



public class DisAppearedNums_LC448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // Cyclic Sort
        int i=0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        //Create an ArrayList to return the List of nums
        List<Integer> ans = new ArrayList<>();
        for(int index =0; index < nums.length;index++){
            if(nums[index] != index + 1){
                ans.add(index + 1);
            }
        }

        return ans;
    }
}
