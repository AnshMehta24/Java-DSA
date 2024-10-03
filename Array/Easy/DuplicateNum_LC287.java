package Array.Easy;

//287. Find the Duplicate Number
//        Medium
//        Topics : Cyclic Sort
//        Companies : Amazon
//        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//        There is only one repeated number in nums, return this repeated number.
//
//        You must solve the problem without modifying the array nums and using only constant extra space.

public class DuplicateNum_LC287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
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

        for(int index = 0; index < nums.length;index++){
            if(nums[index] != index + 1){
                return nums[index];
            }
        }

        return -1;
    }
}
