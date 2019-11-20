package indi.wuyue.leetcode;

public class Solution8 {

    public static int myAtoi(String str) {
        Integer op = 0;
        Integer cur = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (c.equals(' ')) {
                continue;
            }
            if (c.equals('+') || c.equals('-') || op == 0) {

                op = c.equals('-') ? 2 : 1;
            }
            if (Character.isDigit(c)) {
                Integer val = Integer.valueOf(c);
                if (op == 1 && ( cur > Integer.MAX_VALUE / 10 || (cur == Integer.MAX_VALUE / 10 && val == 7))) {
                    cur = Integer.MAX_VALUE;
                    break;
                }
                if (op == 2 && (cur < Integer.MIN_VALUE / 10 || (cur == Integer.MIN_VALUE / 10 && val == 8))) {
                    cur = Integer.MIN_VALUE;
                    break;
                }
                cur = cur * 10 + val;

            }
        }
        return op == 2 ? -cur : cur;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }

}
