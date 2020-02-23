package main.weeklyContest.weekly_contest_177.contest_5170_验证二叉树;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 0; i < leftChild.length; i++) {
            if (!set.contains(i)) {
                return false; // 根节点要包含，否则就是一个新的root
            }
            if (leftChild[i] != -1) {
                if (set.contains(leftChild[i])) {
                    return false; // 左节点之前不能存在，否则成环
                }
                set.add(leftChild[i]);
            }
            if (rightChild[i] != -1) {
                if (set.contains(rightChild[i])) {
                    return false; // 右节点之前不能存在，否则成环
                }
                set.add(rightChild[i]);
            }
        }
        return true;
    }
}
