package main.algorithms.algo_165_比较版本号;

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1Arr = version1.split("\\.");
        String [] v2Arr = version2.split("\\.");
        String[] v1Array = new String[Math.max(v1Arr.length, v2Arr.length)];
        String[] v2Array = new String[Math.max(v1Arr.length, v2Arr.length)];
        for (int i = 0; i < Math.max(v1Arr.length, v2Arr.length); i++) {
            if (i < v1Arr.length) {
                v1Array[i] = v1Arr[i];
            }
            if (i < v2Arr.length) {
                v2Array[i] = v2Arr[i];
            }
        }
        if (v1Arr.length < v2Arr.length) {
            int i = v1Arr.length;
            while (v2Arr.length - i > 0) {
                v1Array[i++] = "0";
            }
        } else {
            int i = v2Arr.length;
            while (v1Arr.length - i > 0) {
                v2Array[i++] = "0";
            }
        }
        int ans = 0;
        for (int i = 0; i < Math.max(v1Array.length, v2Array.length); i++) {
            String v1 = splitStr(v1Array[i]);
            String v2 = splitStr(v2Array[i]);
            if (Integer.parseInt(v1) > Integer.parseInt(v2)) {
                ans = 1;
                break;
            } else if (Integer.parseInt(v1) < Integer.parseInt(v2)){
                ans = -1;
                break;
            }
        }
        return ans;
    }

    public String splitStr(String str) {
        if (str.length() == 1) {
            return str;
        }
        while (str.length() > 1) {
            if (str.charAt(0) == '0') {
                str = str.substring(1);
            } else {
                break;
            }
        }
        return str;
    }
}
