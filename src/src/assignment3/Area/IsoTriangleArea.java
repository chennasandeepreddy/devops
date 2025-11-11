package assignment3.Area;

import java.util.Scanner;

public class IsoTriangleArea {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1 -> {
                System.out.println("If you have all sides enter: ");
                int side1 = sc.nextInt();
                int side2 = sc.nextInt();
                int side3 = sc.nextInt();
                int total = (side1 + side2 + side3) / 2;
                double area = Math.sqrt(total * (total - side1) * (total - side2) * (total - side3));
                System.out.println("Area of iso triangle is: " + area);
            }
            case 2 -> {
                double area = 0;
                System.out.println("Enter if you have two sides: ");
                double side1 = sc.nextInt();
                double base = sc.nextInt();
                double height = getHeight(side1,(base/2));
                area = (1/(double)2)*height*base;
                System.out.println("Area of iso triangle is:" + area);
            }
        }
    }
    public static double getHeight(double side1, double side2) {
        double height = 0;
        if (side1 < side2) {
            height = Math.sqrt(Math.pow(side2, 2) - Math.pow(side1, 2));
        } else
            height = Math.sqrt(Math.pow(side1, 2) - Math.pow(side2, 2));
        return height;
    }
}
