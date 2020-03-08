package main.doubleWeeklyContest.double_weekly_contest_21.double_contest_5336_上升下降字符串;

import java.util.*;

public class Solution {
    public String sortString(String s) {
        List<Map<Character, Integer>> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        List<Character> listCh = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                if (i > 0) {
                    list.add(map);
                }
                map = new HashMap<>();
                map.put(s.charAt(i), 1);
                listCh.add(s.charAt(i));
            }
            if (i == s.length() - 1) {
                list.add(map);
            }
        }
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (sb.toString().length() == len) {
                break;
            }
            if (list.get(i).get(listCh.get(i)) != 0) {
                sb.append(listCh.get(i));
                list.get(i).put(listCh.get(i), list.get(i).get(listCh.get(i)) - 1);
            }
            if (i == list.size() - 1) {
                while (i >= 0) {
                    if (list.get(i).get(listCh.get(i)) != 0) {
                        sb.append(listCh.get(i));
                        list.get(i).put(listCh.get(i), list.get(i).get(listCh.get(i)) - 1);
                    }
                    i--;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String sb = solution.sortString("aaaabbbbcccc");
        System.out.println(sb);
    }
}
