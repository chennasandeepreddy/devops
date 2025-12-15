package parityProblems;

public class SortWithParityII {
        public int[] sortArrayByParityII(int[] nums) {
            int[] arr1= new int[nums.length/2];
            int[] arr2= new int[nums.length/2];
            int[] result=new int[nums.length];
            int count=0;
            for(int num:nums){
                if(num%2==0){
                    arr1[count]=num;
                    count++;
                }
            }
            count=0;
            for(int num:nums){
                if(num%2!=0){
                    arr2[count]=num;
                    count++;
                }
            }
            count=0;
            for(int i=0;i<nums.length;i++){
                if(i%2==0){
                    result[i]=arr1[count];
                    count++;
                }
            }
            count=0;
            for(int i=0;i<nums.length;i++){
                if(i%2!=0){
                    result[i]=arr2[count];
                    count++;
                }
            }
            return result;
        }
}
