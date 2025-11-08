package assignment;

import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        int temp,temp1,temp2,hcf,lcm;
        temp1=number;
        temp2=number2;
        while (temp2!=0){
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
        }
        hcf=temp1;
        lcm=(number*number2)/hcf;
        System.out.println("The hcf of the numbers is "+ hcf);
        System.out.println("The lcm of the numbers is "+ lcm);
    }
}
