//https://leetcode.com/problems/happy-number/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.

// any number less than 10 except 1 & 7 will be ending infinite loop and only these two numbers only end with sum of digits as 1

package code.Math;

public class HappyNumber {
    class Solution {
        public boolean isHappy(int n) {
            while (n >= 10) {
                int sum = 0;
                while (n > 0) {
                    int val = n % 10;
                    sum += val * val;
                    n /= 10;
                }
//                System.out.println(sum);
                n = sum;

            }
            if (n == 1 || n == 7)
                return true;
            return false;
        }
    }
}
