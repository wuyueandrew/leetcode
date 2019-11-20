package indi.wuyue.leetcode;

public class Solution6 {

    public static String convert(String s, int numRows) {
        int length = s.length();
        if (length <= numRows || numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= length / (numRows * 2 - 2); j++) {
                if (i + j * (numRows * 2 - 2) < length) {
                    sb.append(s.charAt(i + j * (numRows * 2 - 2)));
                }
                if (i > 0 && numRows - 1 != i && (j + 1) * (numRows * 2 - 2) - i < length) {
                    sb.append(s.charAt((j + 1) * (numRows * 2 - 2) - i));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }


}
