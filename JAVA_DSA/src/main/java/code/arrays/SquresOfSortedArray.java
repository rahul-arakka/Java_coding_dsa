//https://leetcode.com/problems/squares-of-a-sorted-array/?envType=problem-list-v2&envId=sorting&difficulty=EASY
//Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.

package code.arrays;

public class SquresOfSortedArray {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int i = 0, j = nums.length - 1;
            int[] res = new int[nums.length];
            int x = res.length - 1;
            boolean pointer = false;
            while (i <= j) {
                if (!pointer) {
                    res[x--] = nums[j] * nums[j];
                    j--;
                    pointer = true;
                } else {
                    res[x--] = nums[i] * nums[i];
                    i++;
                    pointer = false;
                }

            }
            return res;
        }

    }
}
