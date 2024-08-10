//https://30dayscoding.com/dsa
//https://leetcode.com/problems/longest-repeating-character-replacement/
//You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
//Return the length of the longest substring containing the same letter you can get after performing the above operations.

// This is brute force approach and suitable for the sample test cases provided in the questions.


package code.twoPointers;

class LongestRepeatingCharacterReplacement {
    class Solution {
        public int characterReplacement(String s, int k) {
            int length = 0;
            char ch = s.charAt(0);
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) != ch) {
                    if (k == 0) return length;
                    k--;
                }

                length++;
            }
            return length;
        }
    }
}