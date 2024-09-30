//https://leetcode.com/problems/longest-harmonious-subsequence/description/?envType=problem-list-v2&envId=array&difficulty=EASY

//We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
//Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
//A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.


package code.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    class Solution {
        public int findLHS(int[] nums) {

            // sort the array and use sliding window, since order of elements doesn't matter
            Arrays.sort(nums);
            int maxLength = 0;
            int i = 0;
            int j = 0;
            int equal = 0;
            int greater = 0;

            while (j < nums.length) {
                // get equal count
                if (nums[j] == nums[i]) {
                    equal++;
                    j++;
                }
                // get greater than count
                else if (nums[j] - nums[i] == 1) {
                    greater++;
                    j++;
                }
                // evaluate if diff is greater than 1 or we have reached end of string
                if (j == nums.length || nums[j] - nums[i] > 1) {
                    // if greater is not present then just move to the next window, no need to find maxLength
                    if (greater == 0) {
                        i = i + equal;
                        equal = 0;
                    }
                    // else calculate maxLength and then move to the next window
                    else {
                        maxLength = Math.max(maxLength, equal + greater);
                        i = i + equal;
                        equal = greater;
                        greater = 0;
                    }

                }

            }

            return maxLength;

        }
    }

}
