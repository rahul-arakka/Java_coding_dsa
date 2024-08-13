//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


package code.strings;

public class FirstOccurrenceInAString {
    class Solution {
        public int strStr(String haystack, String needle) {
            int ans = -1, l = needle.length();
            for (int i = 0; i <= haystack.length() - l; i++) {
                String str = haystack.substring(i, i + l);
                // System.out.println("Printing str : "+ str + " needle : "+ needle);
                if (str.equals(needle))
                    return i;
            }
            return -1;
        }
    }
}
