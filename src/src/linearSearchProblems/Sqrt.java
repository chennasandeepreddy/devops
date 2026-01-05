package linearSearchProblems;

public class Sqrt {
    public static int mySqrt(int x) {  //69
        if(x<2){
            return x;
        }
        int left=1,right=x/2;
        int mid=(left+right)/2;
        int ans=0;
        while(left<=right){
            mid=(left+right)/2;
            long sq = (long) mid * mid;

            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans=mySqrt(4);
        System.out.println(ans);
    }
}
