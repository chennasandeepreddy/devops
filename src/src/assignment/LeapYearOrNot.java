package assignment;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        LeapYearOrNot obj = new LeapYearOrNot();
        obj.leapYearOrNot();
    }
    public void leapYearOrNot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year%4==0 && (year%100==0 && year%400==0)){
            System.out.println("Year is Leap Year");
        }
        else
        System.out.println("Not a Leap Year");
    }
}
