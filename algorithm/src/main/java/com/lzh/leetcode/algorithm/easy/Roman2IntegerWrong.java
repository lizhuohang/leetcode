package com.lzh.leetcode.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lizhuohang
 * @Date: Created in 11:10 18/2/2
 */
public class Roman2IntegerWrong {
    static Map<Character, Integer> orderMap = new HashMap<Character, Integer>();

    static {
        orderMap.put('I', 1);
        orderMap.put('V', 5);
        orderMap.put('X', 10);
        orderMap.put('L', 50);
        orderMap.put('C', 100);
        orderMap.put('D', 500);
        orderMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        return romanToIntSub(array, 0, array.length - 1);
    }

    private int romanToIntSub(char[] array, int begin, int end) {
        if (begin == end) {
            return orderMap.get(array[begin]);
        }
        // find the max , the first or the last
        if (orderMap.get(array[end]) > orderMap.get(array[begin])) {
            // subtract
            return orderMap.get(array[end]) - romanToIntSub(array, begin, end - 1);
        } else {
            // sum
            return orderMap.get(array[begin]) + romanToIntSub(array, begin + 1, end);
        }
    }

    public static void main(String[] args) {
        // wrong case
        String caseString = "MCMXCVI";
        System.out.println(String.format("case String is %s , output is %d , expected is %d", caseString,
                new Roman2IntegerWrong().romanToInt(caseString), 1996));
    }
}
