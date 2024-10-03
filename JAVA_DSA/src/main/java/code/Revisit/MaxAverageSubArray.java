//https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=problem-list-v2&envId=sliding-window&difficulty=EASY
//You are given an integer array nums consisting of n elements, and an integer k.
//Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
package code.Revisit;

public class MaxAverageSubArray {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            double ans = 0.0;
            double sum = 0;
            for (int i = 0; i < k; i++) {
                sum += nums[i];

            }
            ans = sum / k;
            int start = 0;
            int end = k;
            while (end < nums.length) {
                sum -= nums[start];
                sum += nums[end];
                double na = sum / k;
                ans = Math.max(ans, na);
                start++;
                end++;
            }
            return ans;
        }
    }
}
