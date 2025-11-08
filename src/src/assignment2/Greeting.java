package assignment2;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        greet(name);
    }
    public static void greet(String name){
        System.out.println("Greetings "+name);
    }
}
