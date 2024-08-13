//https://leetcode.com/problems/length-of-last-word/description/
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.

package code.strings;

public class LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            String[] str = s.split(" ");
            int n = str[str.length - 1].length();
            return n;
        }
    }
}
