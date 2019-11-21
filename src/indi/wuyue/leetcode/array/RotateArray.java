package indi.wuyue.leetcode.array;

public class RotateArray {

    static class Solution {
        /*官方环状替换*/
        public static void rotate(int[] nums, int k) {
            if (nums.length == 0) {
                return;
            }
            k %= nums.length;
            if (k == 0) {
                return;
            }
            int count = 0;
            for (int i = 0; count < nums.length; i++) {
                int pre = nums[i];
                int prePos = i;
                do {
                    int curPos = (prePos + k) % nums.length;
                    int tmp = nums[curPos];
                    nums[curPos] = pre;
                    pre = tmp;
                    prePos = curPos;
                    count++;
                } while (prePos != i);
            }
        }

        /*  */
        public static void rotate2(int[] nums, int k) {
            for (int i = 0; i < k; i++) {
                int cur = nums[nums.length - 1];
                int tmp;
                for (int j = 0; j < nums.length; j++) {
                    tmp = nums[j];
                    nums[j] = cur;
                    cur = tmp;
                }
            }
        }

        public static void rotate3(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        public static void reverse(int[] nums, int start, int end) {
            while(end > start) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }


    }

    public static void main(String[] args) {
        Solution.rotate2(new int[]{1,2,3,4,5,6,7}, 3);
    }

}
