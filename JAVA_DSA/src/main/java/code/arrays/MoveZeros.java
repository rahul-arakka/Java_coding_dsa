//https://30dayscoding.com/dsa
//https://leetcode.com/problems/move-zeroes/description/
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.

package code.arrays;

public class MoveZeros {
    class Solution {
        public void moveZeroes(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    for (int j = i; j < nums.length - 1; j++) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }
    }
}
