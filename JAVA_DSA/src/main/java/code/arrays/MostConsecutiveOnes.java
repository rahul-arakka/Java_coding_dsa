//https://leetcode.com/problems/max-consecutive-ones/description/?envType=problem-list-v2&envId=array&difficulty=EASY
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

package code.arrays;

public class MostConsecutiveOnes {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0, max = 0;
            for (int num : nums) {
                if (num == 0) {
                    max = Math.max(count, max);
                    count = 0;
                } else {
                    count++;
                }
            }
            max = Math.max(count, max);
            return max;
        }
    }
}
