package assignment3;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        int totalNumbers=new Scanner(System.in).nextInt();
        int count =0;
        int sum=0;
        for(int i=1;i<=totalNumbers;i++){
            System.out.println("Enter the numbers: ");
            int num = new Scanner(System.in).nextInt();
            sum+=num;
            count++;
        }
        System.out.println("The average is:"+sum/(double)count);
    }
}
