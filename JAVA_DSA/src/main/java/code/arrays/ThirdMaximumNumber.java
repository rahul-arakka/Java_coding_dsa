//https://leetcode.com/problems/third-maximum-number/description/?envType=problem-list-v2&envId=array&difficulty=EASY
//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

package code.arrays;

public class ThirdMaximumNumber {
    class Solution {
        public int thirdMax(int[] nums) {
            Integer max1 = null;
            Integer max2 = null;
            Integer max3 = null;
            for (Integer n : nums) {
                if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
                if (max1 == null || n > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                } else if (max2 == null || n > max2) {
                    max3 = max2;
                    max2 = n;
                } else if (max3 == null || n > max3) {
                    max3 = n;
                }
            }
            return max3 == null ? max1 : max3;
        }
    }
}
