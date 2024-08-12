//https://leetcode.com/problems/climbing-stairs/description/
//You are climbing a staircase. It takes n steps to reach the top
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// This is the Fibonacci series question, but in a different way.

package code.arrays;

public class ClimbingStairs {

    class Solution {
        public int climbStairs(int n) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            if (n > 2) {
                for (int i = 2; i <= n; i++) {
                    list.add(list.get(i - 1) + list.get(i - 2));
                }
            } else {
                return n;
            }
            return list.get(n);
        }
    }
}
