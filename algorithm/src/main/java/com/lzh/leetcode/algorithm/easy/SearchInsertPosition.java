package com.lzh.leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/search-insert-position/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 17:08 18/2/2
 */
public class SearchInsertPosition {
//    public int searchInsert(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (target <= nums[i]) return i;
//        }
//        return nums.length;
//    }


    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
