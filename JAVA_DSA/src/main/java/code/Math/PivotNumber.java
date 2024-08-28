//https://leetcode.com/problems/find-the-pivot-integer/
//Given a positive integer n, find the pivot integer x such that:
//The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
//Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

package code.Math;

public class PivotNumber {
    class Solution {
        public int pivotInteger(int n) {
            int[] arr = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += i + 1;
                arr[i] = sum;
            }
            int revSum = 0;
            while (n > 0) {
                revSum += n;
                if (arr[n - 1] == revSum) {
                    return n;
                }
                n--;
            }
            return -1;
        }
    }
}
