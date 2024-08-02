//https://30dayscoding.com/dsa
//https://leetcode.com/problems/valid-palindrome/
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.


class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.toLowerCase().trim();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                result += s.charAt(i);
            }

        }
        int n = result.length();
        for (int i = 0; i < (n + 1) / 2; i++) {
            if (result.charAt(i) != result.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;

    }
}