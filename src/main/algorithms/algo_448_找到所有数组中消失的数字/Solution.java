package main.algorithms.algo_448_找到所有数组中消失的数字;

import java.util.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> resLst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            resLst.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (resLst.contains(nums[i])) {
                resLst.remove(i);
            }
        }
        return resLst;


        // 解法二
//        List<Integer> resLst = new ArrayList<>();
//        int[] flag = new int[nums.length];
//        for (int i =0; i < nums.length; i++) {
//            if (flag[nums[i]] == 0) {
//                flag[nums[i]] = 1;
//            }
//        }
//        for (int i = 0; i < flag.length; i++) {
//            if (flag[i] == 0) {
//                resLst.add(i);
//            }
//        }
//        return resLst;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> lst = solution.findDisappearedNumbers(arr);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(i);
        }
    }
}
