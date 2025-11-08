package assignment2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount in Rupees: ");
        double principle = sc.nextDouble();
        System.out.println("Enter Duration in Years : ");
        double time = sc.nextDouble();
        System.out.println("Enter Rate in %: ");
        double rate = sc.nextDouble();
        calculateSimpleInterest(principle, time, rate);
    }
    public static void calculateSimpleInterest(double principle, double time, double rate){
        double simpleInterest = principle*time*rate/100;
        System.out.println("The simple interest for "+time+" years is: "+simpleInterest);
    }
}
