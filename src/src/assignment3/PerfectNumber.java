package assignment3;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println("Perfect Number");
        }
        else
            System.out.println("Not Perfect Number");
    }
}
