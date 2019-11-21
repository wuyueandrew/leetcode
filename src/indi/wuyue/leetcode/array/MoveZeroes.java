package indi.wuyue.leetcode.array;

public class MoveZeroes {

    static class Solution {
        public static void moveZeroes(int[] nums) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    if (i > index) {
                        nums[index] = nums[i];
                    }
                    index++;
                }
            }
            for (int i = 1; i <= nums.length - index; i++) {
                nums[nums.length - i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution.moveZeroes(new int[]{1});
    }

}

