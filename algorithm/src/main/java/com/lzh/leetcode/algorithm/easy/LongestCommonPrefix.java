package com.lzh.leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 14:59 18/2/2
 */
public class LongestCommonPrefix {

//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) {
//            return "";
//        }
//        char[] arr = strs[0].toCharArray();
//
//        int max = arr.length;
//
//        for (int i = 1; i < strs.length; i++) {
//            String s = strs[i];
//            int j = 0;
//            int limit = max > s.length() ? s.length() : max;
//            for (; j < limit; j++) {
//                if (j >= arr.length || arr[j] != s.charAt(j)) {
//                    break;
//                }
//            }
//            if (j <= 0) {
//                return "";
//            }
//            if (j < max) {
//                max = j;
//            }
//        }
//
//        return strs[0].substring(0, max);
//    }

    public static void main(String[] args) {
        System.out
                .println(new LongestCommonPrefix()
                        .longestCommonPrefix(new String[]{"cfe", "cfesee", "cfesddd", "cfwww"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) {
            return "";
        }
        char[] firstArr = strs[0].toCharArray();
        int max = 0;
        for (int i = 1; i < strs.length; i++) {
            int maxTmp = 0;
            char[] arr = strs[i].toCharArray();
            int j = 0;
            while (j < Math.min(firstArr.length, arr.length) - 1 && firstArr[j] == arr[j]) {
                j++;
            }
            max = Math.max(max, j);
        }
        return strs[0].substring(0, max);
    }
}
