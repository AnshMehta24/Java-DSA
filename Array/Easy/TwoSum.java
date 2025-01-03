package Array.Easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] res = twoSum(arr,9);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)  {
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
