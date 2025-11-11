package assignment4;

public class VoteEligibilityCheck {
    public static void main(String[] args) {
        int age = 1;
        boolean res = voteEligible(age);
        System.out.println(res);
    }
    public static boolean voteEligible(int age){
        return age>=18;
    }
}
