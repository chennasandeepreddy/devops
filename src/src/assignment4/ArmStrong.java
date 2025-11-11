package assignment4;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int result = isArmStrong(num);
        if(num == result){
            System.out.println(num+" is Armstrong number "+result);
        }
        else
            System.out.println("Not Armstrong");
    }
    public static int isArmStrong(int num){
        int count = 0;
        int i=0;
        int result = 0;
        int temp = num;
        while(i<temp){
            int rem = num%10;
            count++;
            temp/=10;
        }
        for (int j=0;j<count;j++){
            int rem = num%10;
            result+=Math.pow(rem,count);
            num/=10;
        }
        return result;
    }
}
