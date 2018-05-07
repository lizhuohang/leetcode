package com.lzh.leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 10:32 18/2/2
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return x == reverse || x == reverse / 10;
    }

//    public boolean isPalindromeBetter(int x) {
//        if (x < 0)
//            return false;
//        if (x < 10)
//            return true;
//
//        int tens = 1;
//        int tmp = x;
//        while (tmp / 10 > 0) {
//            tens *= 10;
//            tmp /= 10;
//        }
//
//        while (tens >= 10) {
//            if (x / tens != x % 10) {
//                return false;
//            }
//            x = x % tens / 10;
//            tens = tens / 100;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindromeBetter(59695));
    }

    public boolean isPalindromeBetter(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        int tens = 1;
        int tmp = x;
        while (tmp / 10 > 0) {
            tens *= 10;
            tmp /= 10;
        }
        while (tens > 0) {
            if (x / tens != x % 10) {
                return false;
            }
            x = x % tens / 10;
            tens = tens / 100;
        }
        return true;
    }
}
