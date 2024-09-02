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
        public int cardPoint(int[] a, int i, int j, int sum, int k) {
            if (k == 0) {
                return sum;
            }

            sum += a[i];
            int sum1 = cardPoint(a, i + 1, j, sum, k - 1);
            sum = sum + a[j] - a[i];
            // System.out.println("i: "+i+" J :"+j+" Sum : "+ sum);
            int sum2 = cardPoint(a, i, j - 1, sum, k - 1);
            return Math.max(sum1, sum2);
        }

        public int maxScore(int[] cardPoints, int k) {
            int sum = 0;
            int i = 0, j = cardPoints.length - 1;
            if (k == cardPoints.length) {
                for (int x = 0; x < cardPoints.length; x++) {
                    sum += cardPoints[x];
                }
                return sum;
            }
            return cardPoint(cardPoints, i, j, sum, k);
            // return ;
        }
    }
}
