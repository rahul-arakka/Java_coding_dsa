//https://leetcode.com/problems/power-of-two/description/
//Given an integer n, return true if it is a power of two. Otherwise, return false.
//An integer n is a power of two, if there exists an integer x such that n == 2x.

package code.Math;

public class PowerOfTwo {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 0) return false;
            while (n != 1) {
                if (n % 2 != 0)
                    return false;
                n /= 2;
            }
            return true;
        }
    }
}
