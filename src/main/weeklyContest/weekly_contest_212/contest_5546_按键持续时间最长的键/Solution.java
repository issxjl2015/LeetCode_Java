package weeklyContest.weekly_contest_212.contest_5546_按键持续时间最长的键;

public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] times = new int[releaseTimes.length];
        times[0] = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            times[i] = releaseTimes[i] - releaseTimes[i - 1];
        }

        int index = 0;
        int maxTine = times[0];
        for (int i = 1; i < times.length; i++) {
            if (times[i] > maxTine) {
                maxTine = times[i];
                index = i;
            } else if (times[i] == maxTine && keysPressed.charAt(index) < keysPressed.charAt(i)) {
                index = i;
            }
        }
        return keysPressed.charAt(index);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] releaseTimes = {23,34,43,59,62,80,83,92,97};
        String keyPressed = "qgkzzihfc";
        char ans = solution.slowestKey(releaseTimes, keyPressed);
        System.out.println(ans);
    }
}
