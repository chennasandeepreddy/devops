package parityProblems;

public class SortWithParity2UsingPointers {
        public int[] sortArrayByParityII(int[] nums) {
            int i = 0; // even index
            int j = 1; // odd index

            while (i < nums.length && j < nums.length) {
                // if even index has odd number, swap with j
                if (nums[i] % 2 == 1) {
                    // find odd index that has even number
                    while (j < nums.length && nums[j] % 2 == 1) {
                        j += 2;
                    }
                    // swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                i += 2;
            }
            return nums;
        }
}
