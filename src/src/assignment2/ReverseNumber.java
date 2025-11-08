package assignment2;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 13245;
        int ans = reverse(number);
        System.out.println(ans);
    }
    public static int reverse(int number){
        int ans=0;
        while(number>0){
            int rem = number%10;
            number/=10;
            ans = ans*10+rem;
        }
        return ans;
    }
}
