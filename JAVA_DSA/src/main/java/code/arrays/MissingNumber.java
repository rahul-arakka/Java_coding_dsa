//https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=sorting&difficulty=EASY
//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

//This approach is the better choice due to its superior time complexity (O(n) vs. Previous approach which is using Array sort() method having time complexity O(n log n)),
//while both have similar space complexity (O(1)).
//Using XOR to find the missing number is a more efficient algorithm than sorting the array first.

package code.arrays;

import java.util.Arrays;

public class MissingNumber {
    public class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                ans = ans ^ i;
            }
            for (int i = 0; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
            return ans;
        }
    }

}
