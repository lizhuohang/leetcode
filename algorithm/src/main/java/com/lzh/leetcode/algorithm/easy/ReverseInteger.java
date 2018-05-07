package com.lzh.leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 10:30 18/2/2
 */
public class ReverseInteger {
//    public int reverse(int x) {
//        int symbol = x > 0 ? 1 : -1;
//        int absX = x * symbol;
//
//        int result = 0;
//        int resultBefore = 0;
//        while (absX > 0) {
//            resultBefore = result;
//            result = result * 10 + absX % 10;
//            if (result / 10 != resultBefore) {
//                return 0;
//            }
//            absX /= 10;
//        }
//        return result * symbol;
//    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(100102));
    }

    public int reverse(int x) {
        int val = 0;
        while (x > 0) {
            val *= 10;
            val += x % 10;
            x /= 10;
        }
        return val;
    }
}
