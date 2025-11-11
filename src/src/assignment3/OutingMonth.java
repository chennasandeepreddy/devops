package assignment3;

public class OutingMonth {
    public static void main(String[] args) {
        int count = 0;
        for (int i=1;i<=31;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("The number of days sandeep can go out is "+count);
    }
}
