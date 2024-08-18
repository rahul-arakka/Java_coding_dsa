//https://30dayscoding.com/dsa
//https://leetcode.com/problems/sort-an-array/description/
//Given an array of integers nums, sort the array in ascending order and return it.
//You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

// This approach has time complexity on O(n2) and uses contant space (temp variable).

package code.arrays;

public class SortAnArray {
    class Solution {
        public int[] sortArray(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }

            }
            return nums;
        }
    }
}
