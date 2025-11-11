package assignment3;

public class ProductsMinusSum {
    public static void main(String[] args) {
        int result = subtractProductAndSum(26);
        System.out.println(result);
    }
    public static int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        while(n>0){
            int rem = n%10;
            mul*=rem;
            sum+=rem;
            n/=10;
        }
        return mul-sum;
    }
}
