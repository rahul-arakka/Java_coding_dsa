//https://leetcode.com/problems/find-the-pivot-integer/
//Given a positive integer n, find the pivot integer x such that:
//The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
//Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

// In this we are using sum of N numbers approach.

package code.Math;

public class PivotNumber {
    class Solution {
        public int pivotInteger(int n) {

            int i = 0;
            while (i < n) {
                int a = i + 1, d = 1, N = i + 1;
                int sum1 = ((N) * (2 + (N - 1) * d)) / 2;

                a = n;
                d = -1;
                N = n - i;
                int sum2 = ((N) * (2 * a + (N - 1) * d)) / 2;
                // System.out.println("printing sum1 "+ sum1 +" printing sum2 :" + sum2);

                if (sum1 == sum2)
                    return i + 1;
                i++;

            }
            return -1;
        }
    }
}
