package main.algorithms.algo_819_最常见的单词;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int max = 0;
        String[] par = paragraph.toLowerCase().split("[\\W]+");
        HashSet<String> bannedset = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < banned.length; i++) {
            bannedset.add(banned[i].toLowerCase());
        }
        for (int i = 0; i < par.length; i++) {
            if (bannedset.contains(par[i])) {
                continue;
            } else {
                if (map.containsKey(par[i])) {
                    int val = map.get(par[i]) + 1;
                    map.put(par[i], val);
                    if (max < val) {
                        max = val;
                    }
                } else {
                    map.put(par[i], 1);
                }
            }
        }
        String rst = "";
        for (String key : map.keySet()) {
            if (map.size() == 1) {
                return key;
            }
        }
        return rst;
    }
}
