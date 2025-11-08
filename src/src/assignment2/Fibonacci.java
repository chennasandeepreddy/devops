package assignment2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int i=2;
        int first = 0;
        int second = 1;
        System.out.print("0 1 ");
        while(i<range){
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
            i++;
        }
    }
}
