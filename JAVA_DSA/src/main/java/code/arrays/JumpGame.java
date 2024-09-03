//https://leetcode.com/problems/jump-game/description/?envType=problem-list-v2&envId=array
//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

//Return true if you can reach the last index, or false otherwise.

package code.arrays;

public class JumpGame {
    class Solution {
        public boolean canJump(int[] nums) {
            int reach = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i > reach) return false;
                reach = Math.max(reach, i + nums[i]);
            }
            return true;
        }
    }
}
