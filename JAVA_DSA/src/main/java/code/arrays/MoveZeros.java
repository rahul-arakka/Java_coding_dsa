//https://30dayscoding.com/dsa
//https://leetcode.com/problems/move-zeroes/description/
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.

// This approach runs in O(n) time complexity and work for all test cases.

package code.arrays;

public class MoveZeros {
    class Solution {
        public void moveZeroes(int[] nums) {
            int x = 0, count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    count++;
                    continue;
                } else {
                    nums[x++] = nums[i];
                }
            }
            while (count > 0) {
                nums[nums.length - count--] = 0;
            }
        }
    }
}
