package assignment3;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        int productPrice = new Scanner(System.in).nextInt();
        int discountPercent = new Scanner(System.in).nextInt();
        int discountPrice = (productPrice*discountPercent)/100;
        System.out.println("Your discount Price is: "+discountPrice);
        System.out.println("Your total amount after discount is: "+(productPrice-discountPrice));
    }
}
