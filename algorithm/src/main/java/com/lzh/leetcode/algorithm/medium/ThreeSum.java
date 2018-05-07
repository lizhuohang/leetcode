package com.lzh.leetcode.algorithm.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/3sum/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 14:58 18/2/11
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (map.containsKey(sum * -1)) {
                    List<Integer> e = new ArrayList<Integer>();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(sum * -1);
                    list.add(e);
                }
            }
        }
        return list;
    }
}
