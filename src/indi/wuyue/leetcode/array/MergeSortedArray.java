package indi.wuyue.leetcode.array;

public class MergeSortedArray {

    static class Solution {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;
            while(i >= 0 && j >= 0) {
                if (nums1[i] < nums2[j]) {
                    nums1[k] = nums2[j];
                    j--;
                } else {
                    nums1[k] = nums1[i];
                    i--;
                }
                k--;
            }
            System.arraycopy(nums2, 0, nums1, 0, j + 1);
        }
    }

    public static void main(String[] args) {
        Solution.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
