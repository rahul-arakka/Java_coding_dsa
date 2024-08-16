//https://leetcode.com/problems/sqrtx/description/
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.

//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

//This approach is suitable for All test cases - with runtime: 79ms, beats: 5.03%
//Memory used: 40.47 MB, beats: 91.74%

package code.arrays;

public class Sqrt {
    class Solution {
        public int mySqrt(int X) {
            if (X < 2) return X;
            long i = 2, x = X;
            boolean bool = i <= (x) ? true : false;
            while (i <= (x + 1) / 2) {
                long val = i * i;
                if (val == x) return (int) i;
                if (val > x) return (int) i - 1;

                i++;

            }
            return (int) i - 1;

        }
    }
}
