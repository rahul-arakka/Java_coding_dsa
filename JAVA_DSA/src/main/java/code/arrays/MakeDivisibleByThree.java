//https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/
//You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
//Return the minimum number of operations to make all elements of nums divisible by 3.

package code.arrays;

public class MakeDivisibleByThree {
    class Solution {
        public int minimumOperations(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (num % 3 != 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
