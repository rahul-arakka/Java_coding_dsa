//https://leetcode.com/problems/perfect-number/
//A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
//Given an integer n, return true if n is a perfect number, otherwise return false.

package code.arrays;

public class PerfectNumber {
    class Solution {
        public boolean checkPerfectNumber(int num) {
            int count = 0, div = num;
            div /= 2;
            while (div > 0) {
                if (num % div == 0)
                    count += div;
                div--;
            }
            if (count == num) return true;
            return false;
        }
    }
}
