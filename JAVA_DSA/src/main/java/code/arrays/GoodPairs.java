//https://leetcode.com/problems/number-of-good-pairs/description/
//Given an array of integers nums, return the number of good pairs.
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.

package code.arrays;

public class GoodPairs {
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
