//https://leetcode.com/problems/contains-duplicate-ii/?envType=problem-list-v2&envId=sliding-window&difficulty=EASY
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
// such that nums[i] == nums[j] and abs(i - j) <= k.

package code.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            List<Integer> list = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    if (Math.abs(i - map.get(nums[i])) <= k)
                        return true;
                }
                map.put(nums[i], i);

            }
            return false;
        }
    }
}
