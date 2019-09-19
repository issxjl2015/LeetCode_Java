package targetString.验证回文字符串;

import com.sun.deploy.util.StringUtils;

public class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String smapping = new StringBuffer(st).reverse().toString();
        if (st.equals(smapping)) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Solution solution = new Solution();
        boolean flag = solution.isPalindrome("Damosel, a poem? A carol? Or a cameo pale? (So mad!)");
        System.out.println(flag);
    }
}
