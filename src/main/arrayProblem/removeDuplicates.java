package main.arrayProblem;
/***
 * 运用快慢指针，初始的时候二者的位置一样，
 * 当快指针指向的内容和满指针指向的内容不一样的时候，
 * 慢指针移动，覆盖此时快指针的值
 * 
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int cur = 0;
        for (int pre = 0; pre < nums.length; pre++) {
            if (nums[cur] != nums[pre]) {
                cur++;
                nums[cur] = nums[pre];
            }
        }
        return ++cur;
    }
}