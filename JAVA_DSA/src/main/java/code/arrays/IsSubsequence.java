//https://leetcode.com/problems/is-subsequence/description/?envType=problem-list-v2&envId=string&difficulty=EASY
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

package code.arrays;

public class IsSubsequence {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int i = 0;
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == s.charAt(i)) {
                    i++;
                }
            }
            if (i == s.length())
                return true;
            return false;
        }
    }
}
