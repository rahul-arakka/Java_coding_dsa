//https://leetcode.com/problems/sqrtx/description/
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.

//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

//This approach is suitable for sample test cases

package code.arrays;

public class Sqrt {
    class Solution {
        public int mySqrt(int x) {
            int val = 0;
            if(x == 0)  return x;
            for(int i=1;i<=x/2;i++){
                val = i*i;
                if(val == x) return i;
                if(val > x) return i-1;
            }
            return 1;

        }
    }
}
