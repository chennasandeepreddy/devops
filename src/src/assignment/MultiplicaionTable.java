package assignment;

import java.util.Scanner;

public class MultiplicaionTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(table+"*"+i+"="+table*i);
        }
    }
}
