package com.lzh.leetcode.algorithm.medium;

/**
 * https://leetcode.com/problems/container-with-most-water/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 17:51 18/2/7
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j && i < height.length - 1 && j > 0) {
            max = Math.max((j - i) * Math.min(height[i], height[j]), max);
            if (height[i] > height[j]) j--;
            else i++;
        }
        return max;
    }
}
