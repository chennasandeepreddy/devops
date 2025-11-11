package assignment5;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int count=0;
        int arr[] = new int[nums.length];
        if(nums.length==1){
            arr[0] = nums[0];
        }
        for(int i=1;i<nums.length;i++){
            arr[0] = nums[0];
            arr[i] = arr[i-1]+nums[i];
        }
        return arr;
    }
}
