package indi.wuyue.leetcode;

public class Solution7 {

    public int reverse(int x) {
        int rev = 0;
        while(x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop == 7)) {
                rev = 0;
                break;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop == 8)) {
                rev = 0;
                break;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {

        Byte b = -128;
        Byte c = -0b10000000;
        byte i = -128;
        System.out.println(c);
    }
}
