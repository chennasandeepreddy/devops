package logical;

import java.util.Scanner;

public class PrimeNumber {
    public void primeOrNot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Prime or Not");
        int num=sc.nextInt();

        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("The number "+num+" s not prime");
                break;
            }
            else {
                System.out.println("The number "+num+" is prime");
                break;
            }
        }
        sc.close();
    }
}
