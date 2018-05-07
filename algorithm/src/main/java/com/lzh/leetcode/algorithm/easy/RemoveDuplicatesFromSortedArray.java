package com.lzh.leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 16:19 18/2/2
 */
public class RemoveDuplicatesFromSortedArray {
//    public int removeDuplicates(int[] nums) {
//        int length = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != nums[length]) {
//                length++;
//                nums[length] = nums[i];
//            }
//        }
//        return length + 1;
//    }

    public int removeDuplicates(int[] nums) {
        int insertIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[insertIndex]) {
                continue;
            }
            nums[++insertIndex] = nums[i];
        }
        return insertIndex + 1;
    }
}
