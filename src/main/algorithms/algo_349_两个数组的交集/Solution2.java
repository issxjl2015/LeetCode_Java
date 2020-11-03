package algorithms.algo_349_两个数组的交集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {

    List<Integer> list = new ArrayList<>();

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0) {
            return nums1;
        }
        if (nums2 == null || nums2.length == 0) {
            return nums2;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        if (nums1.length < nums2.length) {
            helper(list1, list2);
        } else {
            helper(list2, list1);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private void helper(List list1, List list2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < list1.size() && index2 < list2.size()) {
            if ((int)list1.get(index1) < (int)list2.get(index2)) {
                index1++;
            } else if ((int)list1.get(index1) > (int)list2.get(index2)) {
                index2++;
            } else {
                list.add((int)list1.get(index1));
                int tmp = (int) list1.get(index1);
                list1.remove(index1);
                list2.remove(index2);
                while (index1 < list1.size() && (int)list1.get(index1) == tmp) {
                    list1.remove(index1);
                }
                while (index2 < list2.size() && (int)list2.get(index2) == tmp) {
                    list2.remove(index2);
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ans = solution.intersection(nums1, nums2);
        System.out.println(ans);
    }
}
