package assignment2;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        System.out.println("Enter amount in Rupees: ");
        Scanner sc = new Scanner(System.in);
        int rupees = sc.nextInt();
        double dollar = rupees/88.71;
        System.out.println("The equivalent amount in USD is: "+dollar);
    }
}
