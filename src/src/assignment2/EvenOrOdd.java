package assignment2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        typeOfNumber(number);
    }
    public static void typeOfNumber(int number){
        if(number%2==0){
            System.out.println("Number "+number+" is Even");
        }
        else
            System.out.println("Number "+number+" is Odd");
    }
}
