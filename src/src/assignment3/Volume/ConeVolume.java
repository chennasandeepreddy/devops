package assignment3.Volume;

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        System.out.println("The volume of cone is: "+(Math.PI*Math.pow(new Scanner(System.in).nextInt(),2)*new Scanner(System.in).nextInt())/3);
    }
}
