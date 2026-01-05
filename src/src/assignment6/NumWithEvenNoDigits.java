package assignment6;

public class NumWithEvenNoDigits {
    public static void main(String[] args) {
        int[] arr = {12,32,11,2};
        int count=0;
        for(int num:arr){
            int ans=String.valueOf(num).length();
            if(ans%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
