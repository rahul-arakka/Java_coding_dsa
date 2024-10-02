//https://leetcode.com/problems/maximum-product-of-three-numbers/description/?envType=problem-list-v2&envId=sorting&difficulty=EASY
//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

package code.arrays;

import java.util.Arrays;

public class MaximunProductOfThreeNums {
    class Solution {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);

            int n = nums.length;

            return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                    nums[0] * nums[1] * nums[n - 1]);
        }
    }
}
