package kexinleetcode.stringalgo.LC_Z字形变换;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows ==1) {
            return s;
        }
        char[] chArr = s.trim().toCharArray();
        int row = 0, col = 0;
        int len = s.length() / (numRows + 1) * 2 + s.length() % (numRows + 1);
        char[][] strArr = new char[numRows][len];
        for (char ch : chArr) {
            if (col % 2 == 0) {
                strArr[row][col] = ch;
                row++;
            } else {
                strArr[row][col] = ch;
                if (row == 0) {
                    row++;
                } else {
                    row--;
                }
            }
            if (row == numRows) {
                row -= 2;
                col++;
            } else if (row == 0) {
                col++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < strArr[0].length; j++) {
                if ((int)strArr[i][j] != 0) {
                    sb.append(strArr[i][j]);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String s = "LEETCODEISHIRING";
//        int numRows = 4;
        String s = "NGCD";
        int numRows = 2;
        String ans = solution.convert(s, numRows);
        System.out.println(ans);
    }
}
