//https://leetcode.com/problems/buddy-strings/description/
//Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
//Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
//For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

// This approach is suitable for All test cases, and edge cases are also covered.
// Runs with 1ms & beats 98.64%

package code.strings;

import java.util.HashSet;

public class BuddyStrings {
    class Solution {
        public boolean buddyStrings(String s, String goal) {

            if (s.length() != goal.length()) {
                return false;
            }
            HashSet<Character> set = new HashSet<>();

            if (s.equals(goal)) {
                for (char ch : s.toCharArray()) {
                    if (!set.add(ch)) {
                        return true;
                    }
                }
                return false;
            }

            int diff = 0;
            Character sPrev = null;
            Character gPrev = null;
            for (int i = 0; i < s.length(); i++) {
                char s1 = s.charAt(i);
                char g1 = goal.charAt(i);

                if (s1 != g1) {
                    if (diff == 2 || diff == 1 && (s1 != gPrev || g1 != sPrev)) {
                        return false;
                    }

                    sPrev = s1;
                    gPrev = g1;
                    diff++;
                }

            }
            return diff == 2;
        }
    }
}
