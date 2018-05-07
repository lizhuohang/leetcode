package com.lzh.leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/remove-element/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 16:28 18/2/2
 */
public class RemoveElement {
//    public int removeElement(int[] nums, int val) {
//        int length = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[length] = nums[i];
//                length++;
//            }
//        }
//        return length;
//    }


    public int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }
}
