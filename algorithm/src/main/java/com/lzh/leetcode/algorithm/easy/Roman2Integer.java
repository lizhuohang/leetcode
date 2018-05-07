package com.lzh.leetcode.algorithm.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 11:44 18/2/2
 */
public class Roman2Integer {
    static Map<Character, Integer> orderMap = new HashMap<Character, Integer>();

    static Set<Character> subtractChar = new HashSet<Character>();

    static {
        orderMap.put('I', 1);
        orderMap.put('V', 5);
        orderMap.put('X', 10);
        orderMap.put('L', 50);
        orderMap.put('C', 100);
        orderMap.put('D', 500);
        orderMap.put('M', 1000);

        subtractChar.add('I');
        subtractChar.add('X');
        subtractChar.add('C');
    }


    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int val = orderMap.get(arr[s.length() - 1]);
        int lastVal = val;
        for (int i = arr.length - 2; i >= 0; i++) {
            char current = arr[i];
            if (orderMap.get(current) < lastVal && subtractChar.contains(current)) {
                val -= orderMap.get(current);
            } else {
                val += orderMap.get(current);
                lastVal = orderMap.get(current);
            }
        }
        return val;
    }

//    public int romanToInt(String s) {
//        char[] array = s.toCharArray();
//        char latterChar = array[array.length - 1];
//        int result = orderMap.get(latterChar);
//        int latterValue = orderMap.get(latterChar);
//        for (int i = array.length - 2; i >= 0; i--) {
//            int nowValue = orderMap.get(array[i]);
//            if (latterValue > nowValue && subtractChar.contains(array[i])) {
//                result -= nowValue;
//            } else {
//                result += nowValue;
//                latterValue = nowValue;
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        // wrong case
        String caseString = "MCMXCVI";
        System.out.println(String.format("case String is %s , output is %d , expected is %d", caseString,
                new Roman2Integer().romanToInt(caseString), 1996));
    }
}
