package Array.Easy;

public class MissingNum_LC268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNum(nums));
    }

    public static int missingNum(int[] nums){
        int n = nums.length ;
        int i=0;
        while(i < n){
            int correct = nums[i];
            if(nums[i] < n && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        for(int index =0; index < n ;index++){
            if(nums[index] != index){
                return index;
            }
        }

        return n;
    }
}
