//https://leetcode.com/problems/xor-operation-in-an-array/description/
//You are given an integer n and an integer start.
//Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
//Return the bitwise XOR of all elements of nums.


package code.Math;

public class XORInArray {
    class Solution {
        public int xorOperation(int n, int start) {
            int xor = start;
            int i = 1;
            while (i < n) {
                xor = xor ^ (start + (2 * i));
                i++;
            }
            return xor;
        }
    }
}
