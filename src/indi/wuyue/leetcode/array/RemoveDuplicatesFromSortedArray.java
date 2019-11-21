package indi.wuyue.leetcode.array;

public class RemoveDuplicatesFromSortedArray {

    static class Solution26 {
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int tmp = nums[0];
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != tmp) {
                    nums[count++] = nums[i];
                    tmp = nums[i];
                }
            }
            return count;
        }
    }
}

