package assignment5;

import java.util.Arrays;

public class DinstinctArray {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        int ans=(int)Arrays.stream(nums).distinct().count();
        System.out.println(Arrays.stream(nums).distinct().count());
    }
}
