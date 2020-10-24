package algorithms.algo_1024_视频拼接;

public class Solution2 {
    public int videoStitching(int[][] clips, int T) {
        if (T == 0) {
            return 0;
        }

        int[] arr = new int[T]; // 已知时长T <= 100，所以可以用数组排序
        for (int[] clip : clips) {
            if (clip[0] < clip[1] && clip[0] < T && arr[clip[0]] < clip[1]) {
                arr[clip[0]] = clip[1]; // 数组index为片段start，value为片段end
            }
        }

        int count = 0; // 个数
        int preEnd = -1; // 之前所有片段组end的最大值
        int maxEnd = 0; // 当前所有片段组end的最大值

        for (int start = 0; start < arr.length; start++) {
            if (start > maxEnd) { // 片段不连续，非法
                return -1;
            }

            int end = arr[start];
            if (end == 0) {
                continue;
            }

            if (end > maxEnd) { // 当前片段end超过之前所有的片段end
                if (start > preEnd) { // true：代表当前片段为新增片段。false：代表当前片段可以替换前一个片段
                    preEnd = maxEnd;
                    count++;
                }

                if (end >= T) { // 当前片段end大于时长T时，返回个数
                    return count;
                }

                maxEnd = end;
            }
        }

        return -1;
    }
}
