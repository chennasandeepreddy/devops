package assignment3;

import java.util.Scanner;

public class InputAndLargest {
    public static void main(String[] args) {
        boolean flag = true;
        int max=0;
        while(flag){
            int num = new Scanner(System.in).nextInt();
            if(num>max){
                max = num;
            }
            if(num==0){
                flag = false;
            }
        }
        System.out.println("The Largest number entered is: "+max);
    }
}
