package assignment3.Area;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        int i= new Scanner(System.in).nextInt();
        switch(i){
            case 1->{
                int side1 = 20;
                int height = 25;
                int area = side1* height;
                System.out.println("The area of parallelo is :"+area);
            }
            case 2->{
                int length = 11;
                int length2 = 6;
                int side = 13;
                double height = Math.sqrt(Math.pow(side,2)-Math.pow((length-length2),2));
                double area = length*height;
                System.out.println("Area of parallelo is: "+area);
            }
        }
    }
}
