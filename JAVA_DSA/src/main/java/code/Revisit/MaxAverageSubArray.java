//https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=problem-list-v2&envId=sliding-window&difficulty=EASY
//You are given an integer array nums consisting of n elements, and an integer k.
//Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
//Throwing TLE, good for sample test cases.

package code.Revisit;

public class MaxAverageSubArray {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int wind = 0, i = 0, j = k - 1;
            double max = Integer.MIN_VALUE;
            for (int z = 0; z < k; z++) {
                wind = wind + nums[z];
            }
            while (j != nums.length) {
                max = Math.max(max, (double) wind / k);
                j++;
                wind = wind - nums[i];
                i++;
                if (j != nums.length)
                    wind = wind + nums[j];
            }
            return max;
        }
    }

}
