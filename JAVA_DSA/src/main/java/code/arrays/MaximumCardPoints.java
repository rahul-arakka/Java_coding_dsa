//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
//There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
//
//In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
//
//Your score is the sum of the points of the cards you have taken.
//
//Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

// This is Recursion approach and works for sample test cases. | TLE | Array - Medium.

package code.arrays;

public class MaximumCardPoints {
    class Solution {
        public int maxScore(int[] nums, int k) {
            int n = nums.length;
            int lsum = 0;
            int rsum = 0;
            int maxsum = 0;
            for (int i = 0; i < k; i++) {
                lsum = lsum + nums[i];
            }
            maxsum = lsum;
            int rind = n - 1;
            for (int i = k - 1; i >= 0; i--) {
                lsum = lsum - nums[i];
                rsum = rsum + nums[rind];
                maxsum = Math.max(maxsum, lsum + rsum);
                rind--;
            }
            return maxsum;

        }
    }
}
