package assignment;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        byte a = 2;
        byte b = 30;
        int c = a+b;
        System.out.println(c);
        SumOfTwoNumbers obj = new SumOfTwoNumbers();
        int res=obj.sum(20,03);
        System.out.println(res);
    }
    public int sum(int a, int b){
        int result = a+b;
        return result;
    }
}
