package assignment;

import java.util.Scanner;

public class StopAtX {
    public static void main(String[] args) {
        boolean flag = true;
        String value;
        int sum=0;
        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("Taking Input: ");
            value = sc.nextLine();
            if(value.equals("x")){
                flag= false;
            }
            else{
                int intValues = Integer.parseInt(value);
                sum += intValues;
            }
        }
        System.out.println("The sum of numbers is : "+sum);
    }
}
