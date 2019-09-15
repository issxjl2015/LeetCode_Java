package targetString.整数反转;

public class Solution {
    public int reverse(int x) {
        char[] chArr = Integer.toString(x).toCharArray();
        String result = "";
        if (chArr[0] == '-') {
            result += "-";
            for (int i = 1; i <= (chArr.length / 2); i++) {
                char tmp = chArr[i];
                chArr[i] = chArr[chArr.length - i];
                chArr[chArr.length - i] = tmp;
            }
            for (int i = 1; i < chArr.length; i++) {
                result += chArr[i];
            }
        } else {
            for (int i = 0; i <= (chArr.length / 2); i++) {
                char tmp = chArr[i];
                chArr[i] = chArr[chArr.length - i - 1];
                chArr[chArr.length - i - 1] = tmp;
            }
            for (int i = 1; i < chArr.length; i++) {
                result += chArr[i];
            }
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.reverse(-123);
        System.out.println(result);
    }
}
