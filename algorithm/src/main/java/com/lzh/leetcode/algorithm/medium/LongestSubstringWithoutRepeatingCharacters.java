package com.lzh.leetcode.algorithm.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 18:34 18/2/2
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int startIndex = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                int lastIndex = map.get(c);
                max = i - startIndex > max ? i - startIndex : max;
                if (lastIndex >= startIndex) {
                    startIndex = lastIndex + 1;
                } else if (c == s.charAt(startIndex)) {
                    startIndex++;
                }
            }
            map.put(c, i);
        }
        return max > s.length() - startIndex ? max : s.length() - startIndex;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(""));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("cdd"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("aab"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("dvdf"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcadies"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("tmmzuxt"));
    }
}
