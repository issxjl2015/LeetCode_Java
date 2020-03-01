package main.weeklyContest.weekly_contest_178.contest_5345_通过投票对团队排名;

import java.util.*;

public class Solution {
    public String rankTeams(String[] votes) {
        if (votes == null || votes.length == 0) {
            return "";
        }
        if (votes.length == 1) {
            return votes[0];
        }
        int row = votes.length;
        int col = votes[0].length();
        List<TreeMap<Character, Integer>> list = new ArrayList<>();
        for (int j = 0; j < col; j++) {
            TreeMap<Character, Integer> map = new TreeMap<>();
            for (int i = 0; i < row; i++) {
                if (map.containsKey(votes[i].charAt(j))) {
                    int val = map.get(votes[i].charAt(j));
                    map.put(votes[i].charAt(j), val + 1);
                } else {
                    map.put(votes[i].charAt(j), 1);
                }
            }
            list.add(map);
        }
        StringBuilder sb = new StringBuilder();
        for (TreeMap<Character, Integer> map : list) {
            int count = 0;
            Character ch = map.firstKey();
            for (Map.Entry<Character, Integer> set : map.entrySet()) {
                if (set.getValue() > count) {
                    count = set.getValue();
                    ch = set.getKey();
                } else if (set.getValue() == count) {
                    ch = set.getKey() - ch < 0 ? ch : set.getKey();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] strs = {"ABC","ACB","ABC","ACB","ACB"};
        String[] strs = {"WXYZ","XYZW"};
        String ans = solution.rankTeams(strs);
        System.out.println(ans);
    }
}
