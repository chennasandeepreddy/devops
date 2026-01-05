package linearSearchProblems;

public class findNumbers {
        public int findNumbers(int[] nums) {
            int count=0;
            int ans=0;
            for(int num:nums){
                while(num>0){
                    count++;
                    num/=10;
                }
                if(count%2==0){
                    ans++;
                }
                count=0;
            }
            return ans;
        }
}
