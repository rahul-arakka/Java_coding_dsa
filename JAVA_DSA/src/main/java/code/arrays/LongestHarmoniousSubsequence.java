//https://leetcode.com/problems/longest-harmonious-subsequence/description/?envType=problem-list-v2&envId=array&difficulty=EASY

//We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
//Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
//A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.


package code.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    class Solution {
        public int findLHS(int[] nums) {

            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;


            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            for (int key : map.keySet()) {
                if (map.containsKey(key + 1)) {
                    count = Math.max(count, map.get(key) + map.get(key + 1));
                }
            }
            return count;
        }
    }
}
