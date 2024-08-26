//https://leetcode.com/problems/buddy-strings/description/
//Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
//Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
//For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

// This approach is suitable for sample test cases, and edge cases are not covered.

package code.strings;

public class BuddyStrings {
    class Solution {
        public boolean buddyStrings(String s, String goal) {
            // String[]
            for (int i = 0; i < s.length(); i++) {

                for (int j = 0; j < s.length(); j++) {
                    StringBuilder str = new StringBuilder(s);
                    if (i == j) continue;
                    char c = str.charAt(i);
                    str.setCharAt(i, str.charAt(j));
                    str.setCharAt(j, c);
                    String s2 = str.toString();
                    // System.out.println("printing str : "+s2);
                    if (goal.equals(s2)) {
                        return true;
                    }

                }
            }
            return false;
        }
    }
}
