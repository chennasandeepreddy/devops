package assignment2;

import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Select the operation to perform: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'A': int result = a+b;
                System.out.println("addition value is :"+result);
                break;
            case 'B': result = a-b;
                System.out.println("Substraction value is :"+Math.abs(result));
                break;
            case 'C': int mul = a*b;
                System.out.println("Multiplication value is: "+mul);
                break;
            case 'D': int div = a/b;
                System.out.println("Division value is: "+div);
                break;
            default:
                System.out.println("Operation Ended");
        }
    }
}
