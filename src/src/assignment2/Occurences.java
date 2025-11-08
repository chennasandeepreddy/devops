package assignment2;

public class Occurences {
    public static void main(String[] args) {
        int num = 1383933312;
        int occurenceCount = occurenceOfNumber(num);
        System.out.println("The occurences of the "+num+" is "+occurenceCount);
    }
    public static int occurenceOfNumber(int num){
        int count = 0;
        while(num!=0){
            int rem = num%10;
            if(rem==3){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}
