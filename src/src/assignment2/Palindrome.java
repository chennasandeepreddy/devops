package assignment2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String newString= "";
        for(int i=1;i<=text.length();i++){
            char ch = text.charAt(text.length()-i);
            newString+=ch;
        }
        System.out.println(newString);
        if(newString.equals(text)){
            System.out.println(text+" is palindrome");
        }
        else
            System.out.println(text+" is not palindrome");
    }
}
