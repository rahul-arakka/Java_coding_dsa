//https://leetcode.com/problems/add-digits/description/
//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

package code.Math;

public class AddDigits {
    class Solution {
        public int addDigits(int n) {
            if (n == 0) return 0;
            return 1 + (n - 1) % 9;
        }
    }
}
