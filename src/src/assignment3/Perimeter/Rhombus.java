package assignment3.Perimeter;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        System.out.println("Perimeter of rhombus with sides is:"+4*new Scanner(System.in).nextInt());
        System.out.println("With known diameter is:"+2*(Math.pow(new Scanner(System.in).nextInt(),2)+Math.pow(new Scanner(System.in).nextInt(),2)));
    }
}
