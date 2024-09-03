//https://leetcode.com/problems/jump-game/description/?envType=problem-list-v2&envId=array
//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

//Return true if you can reach the last index, or false otherwise.

package code.arrays;

public class JumpGame {
    class Solution {
        public boolean func(int[] a, int i, int n) {
            if (i == n)
                return true;
            if (a[i] == 0 || i > n)
                return false;

            return func(a, a[i] + i, n);
            // boolean bool1 = func(a, a[i]+i, n);
            // boolean bool2 = func(a, a[i]+i-1, n);
            // return bool1 || bool2;
        }

        public boolean canJump(int[] nums) {
            int i = 0, n = nums.length;
            boolean result = func(nums, i, n - 1);
            return result;
        }
    }
}
