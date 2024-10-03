package Array.Easy;

//442. Find All Duplicates in an Array
//        Medium
//        Topics: Cycliic Sort
//        Companies : Microsoft
//        Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
//
//        You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

import java.util.*;

public class FindAllDuplicateNums_LC442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        //Cyclic Sort
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

        // create ArrayList because of the return
        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index < nums.length;index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }

        return ans;
    }
}
