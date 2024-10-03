//https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=problem-list-v2&envId=sliding-window&difficulty=EASY
//You are given an integer array nums consisting of n elements, and an integer k.
//Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
package code.Revisit;

public class MaxAverageSubArray {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            double max = Double.NEGATIVE_INFINITY;
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                double sum = 0;
                int count = 0;

                for (int j = i; j < i + k && j < n; j++) {
                    sum += nums[j];
                    count++;
                }


                if (count == k) {
                    double avg = sum / k;
                    max = Math.max(avg, max);
                }
            }

            return max;
        }
    }

}
