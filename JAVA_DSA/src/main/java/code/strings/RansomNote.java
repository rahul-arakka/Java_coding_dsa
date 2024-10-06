//https://leetcode.com/problems/ransom-note/?envType=problem-list-v2&envId=counting&difficulty=EASY
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.

package code.strings;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    class Solution {
        public boolean canConstruct(String r, String m) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < m.length(); i++) {
                map.put(m.charAt(i), map.getOrDefault(m.charAt(i), 0) + 1);
            }
            for (int i = 0; i < r.length(); i++) {
                if (!map.containsKey(r.charAt(i)) || map.get(r.charAt(i)) == 0) {
                    return false;
                }
                map.put(r.charAt(i), map.get(r.charAt(i)) - 1);
            }

            return true;

        }
    }
}
