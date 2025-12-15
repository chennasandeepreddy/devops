package assignment5;

public class RemoveDuplicates {
        public int removeDuplicates(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    nums[count] = nums[i];
                    count++;
                } else {
                    continue;
                }
            }
            nums[count] = nums[nums.length - 1];
            count++;
            return count;
        }
}
