package com.lzh.leetcode.algorithm.medium;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 11:01 18/2/7
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int begin = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int l1 = getLength(s, i, i);
            int l2 = getLength(s, i, i + 1);
            int l = Math.max(l1, l2);
            if (l > end - begin) {
                end = i + l / 2;
                begin = i - (l - 1) / 2;
            }
        }
        return s.substring(begin, end + 1);
    }

    private int getLength(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("cbbd"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("cbddbd"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("bbbbbb"));
    }
}
