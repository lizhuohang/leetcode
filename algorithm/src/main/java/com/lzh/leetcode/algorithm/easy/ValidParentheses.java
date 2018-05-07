package com.lzh.leetcode.algorithm.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 15:37 18/2/2
 */
public class ValidParentheses {
    static Map<Character, Integer> map = new HashMap<Character, Integer>();

    static {
        map.put('(', 1);
        map.put('{', 2);
        map.put('[', 3);

        map.put(')', -1);
        map.put('}', -2);
        map.put(']', -3);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            Character c = arr[i];
            Integer value = map.get(c);
            if (value == null) {
                continue;
            }
            if (value > 0) {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            Character ct = stack.pop();
            if (map.get(ct) + value != 0) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValidBetter(String s) {
        char[] stack = new char[s.length() / 2 + 1];
        char[] arr = s.toCharArray();
        int lastIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = arr[i];
            Integer value = map.get(c);
            if (value == null) {
                continue;
            }
            if (value > 0) {
                stack[lastIndex++] = c;
                continue;
            }

            if (lastIndex == 0) {
                return false;
            }
            Character ct = stack[(lastIndex--) - 1];
            if (map.get(ct) + value != 0) {
                return false;
            }
        }
        return lastIndex == 0;
    }


    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValidBetter("()"));
        System.out.println((int) '(');
        System.out.println((int) ')');
        System.out.println((int) '{');
        System.out.println((int) '}');
        System.out.println((int) '[');
        System.out.println((int) ']');
    }
}
