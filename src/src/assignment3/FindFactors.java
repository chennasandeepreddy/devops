package assignment3;

import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0)
                System.out.println("The number "+i+" is a factor for "+num);
        }
    }
}
