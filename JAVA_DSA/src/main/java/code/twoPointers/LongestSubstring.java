//https://30dayscoding.com/dsa
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
//Given a string s, find the length of the longest substring without repeating characters.

package code.twoPointers;

class LongestSubstring {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int length = 1, max = 1;
            int i = 0, j = 1;
            char[] str = s.toCharArray();
            while (j < str.length) {
                if (str[j] == str[j - 1]) {
                    i = j;
                    j = i + 1;
                    length = 1;
                } else {
                    if (str[i] != str[j]) {
                        length++;
                        j++;
                    } else {
                        if (length > max) {
                            max = length;
                        }
                        i++;
                        j++;
                    }
                }
            }
            return max;
        }
    }
}