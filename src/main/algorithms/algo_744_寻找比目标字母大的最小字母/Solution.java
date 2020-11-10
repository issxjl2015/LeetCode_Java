package algorithms.algo_744_寻找比目标字母大的最小字母;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int[] arr = new int[26];
        int index = target - 'a';
        for (char c : letters) {
            arr[c -'a']++;
        }

        for (int i = index + 1; i < 26; i++) {
            if (arr[i] > 0) {
                return (char) ('a' + i);
            }
        }
        for (int i = 0; i < index; i++) {
            if (arr[i] > 0) {
                return (char) ('a' + i);
            }
        }
        return letters[0];
    }
}
