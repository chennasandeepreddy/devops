package assignment3;

import java.util.Scanner;

public class InputAndSum {
    public static void main(String[] args) {
        boolean flag =true;
        int sum=0;
        while(flag){
            int num = new Scanner(System.in).nextInt();
            sum+=num;
            if(num==0){
                flag = false;
            }
        }
        System.out.println(sum);
    }
}
