package assignment4;

public class MaxOrMinThree {
    public static void main(String[] args) {
        int num1 = 11, num2 = 13, num3 =19;
        int max = maximumAmongThree(num1, num2, num3);
        int min = minimumAmongThree(num1, num2, num3);
        System.out.println("Max number is:"+max);
        System.out.println("Min number is:"+min);
    }
    public static int maximumAmongThree(int num1, int num2, int num3){
        int max = num1;
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        return  max;
    }
    public static int minimumAmongThree(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min)
            min = num2;
        if (num3 < min)
            min = num3;
        return min;
    }
}
