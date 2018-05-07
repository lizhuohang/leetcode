package com.lzh.leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/implement-strstr/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 16:42 18/2/2
 */
public class ImplementstrStr {
//    public int strStr(String haystack, String needle) {
//        for (int i = 0; ; i++) {
//            for (int j = 0; ; j++) {
//                if (j == needle.length()) return i;
//                if (i + j == haystack.length()) return -1;
//                if (haystack.charAt(i + j) != needle.charAt(j)) break;
//            }
//        }
//    }

    public static void main(String[] args) {
        System.out.println(new ImplementstrStr().strStr("caaaa", "aaaa"));
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j >= needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
