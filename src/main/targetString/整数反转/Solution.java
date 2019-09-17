package targetString.整数反转;

/**
 * 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * */
public class Solution {
    /**
     * 解法一
     * */
//    public int reverse(int x) {
//        char[] chArr = Integer.toString(x).toCharArray();
//        String result = "";
//        if (chArr[0] == '-') {
//            result += "-";
//            for (int i = 1; i <= (chArr.length / 2); i++) {
//                char tmp = chArr[i];
//                chArr[i] = chArr[chArr.length - i];
//                chArr[chArr.length - i] = tmp;
//            }
//            for (int i = 1; i < chArr.length; i++) {
//                result += chArr[i];
//            }
//        } else {
//            for (int i = 0; i <= (chArr.length / 2); i++) {
//                char tmp = chArr[i];
//                chArr[i] = chArr[chArr.length - i - 1];
//                chArr[chArr.length - i - 1] = tmp;
//            }
//            for (int i = 0; i < chArr.length; i++) {
//                result += chArr[i];
//            }
//        }
//        int temp = Integer.parseInt(result);
//        if(temp < Integer.MIN_VALUE || temp>Integer.MAX_VALUE)
//            return 0;
//        return temp;
//    }

    /**
     * 解法二
     * */
//    public int reverse(int x) {
//        if (x == 0)
//            return 0;
//        StringBuilder s = new StringBuilder();
//        char[] num1 = "2147483647".toCharArray();
//        char[] num2 = "2147483648".toCharArray();
//
//        int num = x < 0 ? -x : x;
//        while (num != 0) {
//            s.append(num % 10);
//            num /= 10;
//        }
//        if (s.length() > 10)
//            return 0;
//
//        if (s.length() == 10) {
//            if (x > 0) {
//                for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) - '0' > num1[i] - '0')
//                        return 0;
//                    else if (s.charAt(i) - '0' < num1[i] - '0')
//                        break;
//                }
//            } else {
//                for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) - '0' > num2[i] - '0')
//                        return 0;
//                    else if (s.charAt(i) - '0' < num2[i] - '0')
//                        break;
//                }
//            }
//        }
//        return x < 0 ? Integer.parseInt("-" + s.toString()) : Integer.parseInt(s.toString());
//    }

    /**
     * 解法三
     * */
    public int reverse(int x){
        long temp=0;
        while(x!=0){
            temp*=10;
            temp+=x%10;
            x/=10;
        }
        if(temp<Integer.MIN_VALUE || temp>Integer.MAX_VALUE)
            return 0;
        return (int)temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.reverse(964624317);
        System.out.println(result);
    }
}
