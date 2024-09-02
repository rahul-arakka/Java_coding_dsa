//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
//There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
//
//In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
//
//Your score is the sum of the points of the cards you have taken.
//
//Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

// This is brute force approach and works for sample test cases. | Array - Medium.

package code.arrays;

public class MaximumCardPoints {
    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int sum = 0;
            int i = 0, j = cardPoints.length - 1;
            while (k > 0) {
                if (cardPoints[i] == cardPoints[j]) {
                    sum += cardPoints[i];
                    i++;
                    j--;
                } else if (cardPoints[i] > cardPoints[j]) {
                    sum += cardPoints[i];
                    i++;
                } else {
                    sum += cardPoints[j];
                    j--;
                }
                k--;
            }
            return sum;
        }
    }
}
