package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
 * nums[0] + nums[1] == 9, we return [0, 1].
 * 
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 11, 7, 10, 2 };
		int target = 9;
		TwoSum sum = new TwoSum();
		int[] result = sum.addtwonum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
	}

	public int[] addtwonum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int rest = target - nums[i];

			if (map.containsKey(rest)) { 
				return new int[] { map.get(rest), i };
			
			}  
				map.put(nums[i], i);
			 

		}
        return new int[0];
	}
}
