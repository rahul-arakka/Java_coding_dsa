//https://leetcode.com/problems/palindrome-number/description/
//Given an integer x, return true if x is a palindrome, and false otherwise.
// Difficulty: Easy

package code.strings;

public class PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            String num = String.valueOf(x);
            int l = 0, r = num.length() - 1;
            while (l <= r) {
                if (num.charAt(l++) != num.charAt(r--)) {
                    return false;
                }
            }
            return true;
        }
    }
}
