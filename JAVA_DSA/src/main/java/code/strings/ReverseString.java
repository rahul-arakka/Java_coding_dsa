//https://30dayscoding.com/dsa
//https://leetcode.com/problems/reverse-string/description/
//Write a function that reverses a string. The input string is given as an array of characters s.
//You must do this by modifying the input array in-place with O(1) extra memory.

package code.strings;

public class ReverseString {
    class Solution {
        public void reverseString(char[] s) {
            int n = s.length;
            for (int i = 0; i < (n + 1) / 2; i++) {
                char temp = s[i];
                s[i] = s[n - 1 - i];
                s[n - 1 - i] = temp;
            }
            return;
        }
    }
}
