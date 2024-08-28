//https://leetcode.com/problems/add-digits/description/
//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

package code.Math;

public class AddDigits {
    class Solution {
        public int addDigits(int n) {
            while (n > 9) {
                int sum = 0;
                int n2 = n;
                while (n2 > 0) {
                    sum += n2 % 10;
                    n2 /= 10;
                }
                n = sum;
            }
            return n;
        }
    }
}
