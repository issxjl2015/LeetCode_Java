package weeklyContest.weekly_contest_221.contest_1_5637_判断字符串的两半是否相似;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean halvesAreAlike(String s) {
        String ss = s.toLowerCase();

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        Map<Character, Integer> mapa = new HashMap<>();
        Map<Character, Integer> mapb = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(ss.charAt(i))) {
                continue;
            }
            if (i < s.length() / 2) {
                mapa.put(ss.charAt(i), mapa.getOrDefault(ss.charAt(i), 0) + 1);
            } else {
                mapb.put(ss.charAt(i), mapb.getOrDefault(ss.charAt(i), 0) + 1);
            }
        }
        int cnta = 0, cntb = 0;
        for (Character ch : set) {
            cnta += mapa.getOrDefault(ch, 0);
            cntb += mapb.getOrDefault(ch, 0);
        }

        if (cnta != cntb) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String s = "book";
        String s = "AbCdEfGh";
        boolean flag = solution.halvesAreAlike(s);
        System.out.println(flag);
    }
}
