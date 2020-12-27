package doubleWeeklyContest.double_weekly_contest_42.double_contest_5621_无法吃午餐的学生数量;

public class Solution2 {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] stdArr = new int[2];
        for (int i : students) {
            stdArr[i]++;
        }

        for (int i : sandwiches) {
            if (stdArr[i] == 0) {
                break;
            }
            stdArr[i]--;
        }
        return stdArr[0] + stdArr[1];
    }
}
