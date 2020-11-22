package weeklyContest.weekly_contest_261.contest_5605_检查两个字符串数组是否相等;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        for (String str : word1) {
            str1.append(str);
        }
        for (String str : word2) {
            str2.append(str);
        }
        if (str1 != null && str2 != null && str1.toString().equals(str2.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean ans = solution.arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }
}
