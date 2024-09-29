//https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=sorting&difficulty=EASY
//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.


package code.arrays;

import java.util.Arrays;

public class MissingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            int i = 0;
            while(i<nums.length){
                if(nums[i] != i++){
                    return i-1;
                }
            }

            return i;
        }
    }
}
