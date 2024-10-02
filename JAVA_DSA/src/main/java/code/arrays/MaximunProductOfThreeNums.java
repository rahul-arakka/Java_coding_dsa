//https://leetcode.com/problems/maximum-product-of-three-numbers/description/?envType=problem-list-v2&envId=sorting&difficulty=EASY
//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

package code.arrays;

public class MaximunProductOfThreeNums {
    class Solution {
        public int maximumProduct(int[] nums) {
            int prd = 1;
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j > 2) {
                    prd /= nums[i++];
                }
                prd *= nums[j];
            }
            return prd;
        }
    }
}
