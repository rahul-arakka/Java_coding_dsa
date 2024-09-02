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

        public int maxScore(int[] cardPoints, int k) {
            int n = cardPoints.length, sum = 0;
            if (n == k) {
                for (int i = 0; i < n; i++) {
                    sum += cardPoints[i];
                }
                return sum;
            }
            int max = 0;
            int start = k;
            for (int i = 0; i < k + 1; i++) {
                sum = 0;
                for (int j = start - 1; j >= start - k; j--) {
                    int x = (j + n) % n;
                    sum += cardPoints[x];
                }
                max = Math.max(sum, max);
                start--;

            }
            return max;
        }
    }
}
