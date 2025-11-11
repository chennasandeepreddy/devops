package assignment3;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = new Scanner(System.in).next().charAt(0);
        switch (ch){
            case 'a','e','i','o','u'-> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
