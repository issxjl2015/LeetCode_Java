package Leetbook.datastructure.illustration_of_algorithm.searchalgorithm.Offer50_第一个只出现一次的字符;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] charArr = s.toCharArray();
        for (char ch : charArr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return ' ';
    }
}
