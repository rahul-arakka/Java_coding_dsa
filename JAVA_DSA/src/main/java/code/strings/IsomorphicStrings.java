//https://leetcode.com/problems/isomorphic-strings/description/?envType=problem-list-v2&envId=string&difficulty=EASY
//Given two strings s and t, determine if they are isomorphic.
//
//        Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.


package code.strings;

import java.util.ArrayList;
import java.util.List;

public class IsomorphicStrings {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false;
            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();
            int count1 = 0, count2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!list1.contains(s.charAt(i))) {
                    list1.add(s.charAt(i));
                    count1++;
                }
                if (!list2.contains(t.charAt(i))) {
                    list2.add(t.charAt(i));
                    count2++;
                }

            }
            if (count1 == count2) {
                return true;
            }
            return false;
        }

    }
}
