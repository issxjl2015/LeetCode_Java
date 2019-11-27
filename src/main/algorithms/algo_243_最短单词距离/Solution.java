package main.algorithms.algo_243_最短单词距离;

/**
 * 给定一个单词列表和两个单词 word1 和 word2，返回列表中这两个单词之间的最短距离。
 *
 * 示例:
 * 假设 words = ["practice", "makes", "perfect", "coding", "makes"]
 *
 * 输入: word1 = “coding”, word2 = “practice”
 * 输出: 3
 * 输入: word1 = "makes", word2 = "coding"
 * 输出: 1
 * 注意:
 * 你可以假设 word1 不等于 word2, 并且 word1 和 word2 都在列表里。
 *
 * 思路：
 * 可以记录两个下标 i1 和 i2 来显著提高暴力的时间复杂度，
 * 我们保存 word1 和 word2 的 最近 出现位置。
 * 每次我们发现一个新的单词出现位置，我们不需要遍历整个数组
 * 去找到另一个单词，因为我们已经记录了最近出现位置的下标。
 *
 * */
public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int index1 = -1, index2 = -1;
        int distance = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
            }else if (words[i].equals(word2)) {
                index2 = i;
            }

            if (index1 != -1 && index2 != -1) {
                distance = Math.min(distance, Math.abs(index1 - index2));
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        int distance = solution.shortestDistance(words, word1, word2);
        System.out.println(distance);
    }
}
