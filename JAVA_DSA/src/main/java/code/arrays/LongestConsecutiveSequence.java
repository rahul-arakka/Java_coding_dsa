//https://30dayscoding.com/dsa
//https://leetcode.com/problems/longest-consecutive-sequence/ - Medium Difficulty
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.

//Optimal solution better than the solution provided as answer.

//This solution is valid for array contains duplicate or non duplicate elements both - Enhanced verison

package code.arrays;

class LongestConsecutiveSequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) return 0;
            Arrays.sort(nums);
            int count = 1, max = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) continue;
                if (nums[i] + 1 == nums[i + 1]) {
                    count++;
                    max = Math.max(max, count);
                } else
                    count = 1;
            }


            return max;
        }
    }
}