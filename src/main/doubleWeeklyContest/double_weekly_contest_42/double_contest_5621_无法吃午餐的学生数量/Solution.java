package doubleWeeklyContest.double_weekly_contest_42.double_contest_5621_无法吃午餐的学生数量;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> std = new LinkedList<>();

        for (int i : students) {
            std.offer(i);
        }

        for (int i = 0; i < sandwiches.length; i++) {
            // 队列为空，说明所有学生都满足了
            if (std.isEmpty()) {
                return 0;
            }

            // 记录学生长度
            int size = std.size();
            boolean like = false;
            // 其实就是一直遍历，直到所有的人都询问过是否喜欢这块三明治，才会结束
            for (int s = 0; s < size; s++) {
                int poll = std.poll();
                if (poll != sandwiches[i]) {
                    std.offer(poll);
                } else {
                    // 最前面的三明治有人喜欢，停止遍历，继续判断下一块三明治
                    like = true;
                    break;
                }
            }

            if (!like) {
                // 最前面的三明治没人喜欢，结束，返回不能满足
                return size;
            }
        }
        return std.size();
    }
}
