package assignment5;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String sentence="san";
        String s = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++) {
            if (sentence.contains(arr[i])) {
                System.out.println("true");
            }
        }
    }
}
