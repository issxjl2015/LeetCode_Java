package targetArray.加一;

/**
 *
 * 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * 思想：
 * ①从数组末尾往前遍历，如果加上1之后等于10，则将该位置置0，进位到下一位
 * ②如果不等于10则退出循环
 * ③循环结束后，判断首位是否为0，如果是则代表要拓展一位
 *
 **/
class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while(i >= 0  && (digits[i] = digits[i]+1) == 10){
            digits[i] = 0;
            i--;
        }
        if(digits[0] == 0){
            int[] temp = new int[digits.length+1];
            temp[0] = 1;
            return temp;
        }
        return digits;
    }
}
