package assignment3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int mul=1;
        for(int i=1;i<=num;i++){
            mul*=i;
        }
        System.out.println("The factorial of number is :"+mul);
    }
}
