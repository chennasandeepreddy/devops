package assignment3.Volume;

import java.util.Scanner;

public class NumbersFilter {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int negSum = 0;
        int[] arr = new int[10];
        for(int num:arr){
            int input = new Scanner(System.in).nextInt();
            if(input>0){
                if (input%2==0)
                    evenSum+=input;
                else
                    oddSum+=input;
            }
            else
                negSum+=input;
        }
        System.out.println("Even sum is: "+evenSum);
        System.out.println("Odd sum is: "+oddSum);
        System.out.println("Neg sum is: "+negSum);
    }
}
