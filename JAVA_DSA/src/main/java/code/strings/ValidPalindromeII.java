//https://30dayscoding.com/dsa
//https://leetcode.com/problems/valid-palindrome-ii/description/
//Given a string s, return true if the s can be palindrome after deleting at most one character from it.

package code.strings;

public class ValidPalindromeII {
    class Solution {
        public boolean validPalindrome(String s) {
            int i = 0, j = s.length() - 1;
            while (i < j)
                if (s.charAt(i) == s.charAt(j)) {
                    i += 1;
                    j -= 1;
                } else
                    return validPalindromeUtil(s, i + 1, j) || validPalindromeUtil(s, i, j - 1);
            return true;
        }

        boolean validPalindromeUtil(String s, int i, int j) {
            while (i < j)
                if (s.charAt(i) == s.charAt(j)) {
                    i += 1;
                    j -= 1;
                } else {
                    return false;
                }

            return true;
        }
    }

}
