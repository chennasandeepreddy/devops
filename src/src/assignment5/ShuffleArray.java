package assignment5;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[n];
        int arr2[] = new int[n];
        int result[] = new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        for(int j=n;j<2*n;j++){
            arr2[j-n]=nums[j];
        }
        for(int k=0;k<result.length;k++){
            if(k%2==0){
                result[k]=arr[k/2];
            }
            else{
                result[k]=arr2[k/2];
            }
        }
        return result;
    }
}
