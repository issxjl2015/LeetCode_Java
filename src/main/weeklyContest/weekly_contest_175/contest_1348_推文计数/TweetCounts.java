package main.weeklyContest.weekly_contest_175.contest_1348_推文计数;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TweetCounts {

    Map<String, List<Integer>> map;

    public TweetCounts() {
        map = new HashMap<>();
    }

    public void recordTweet(String tweetName, int time) {
        if (!map.containsKey(tweetName)) {
            map.put(tweetName, new ArrayList<>());
        }
        map.get(tweetName).add(time);
    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        // 返回的结果
        List<Integer> res = new ArrayList<>();
        List<Integer> list = map.get(tweetName);
        int delta = 60;
        if (freq.equals("hour")) {
            delta = 3600;
        } else if (freq.equals("day")) {
            delta = 3600 * 24;
        }

        int n = (endTime - startTime) / delta + 1;
        int[] ans = new int[n];
        for (int a : list) {
            if (a < startTime || a > endTime) {
                continue;
            }
            ans[(a - startTime) / delta]++;
        }
        for (int a : ans) {
            res.add(a);
        }
        return res;
    }
}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */
