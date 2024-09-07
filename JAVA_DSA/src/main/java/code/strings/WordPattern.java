//https://leetcode.com/problems/word-pattern/description/?envType=problem-list-v2&envId=string
//Given a pattern and a string s, find if s follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
//
//Each letter in pattern maps to exactly one unique word in s.
//Each unique word in s maps to exactly one letter in pattern.
//No two letters map to the same word, and no two words map to the same letter.

package code.strings;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] values = s.split(" ");
            Map<Character, String> map = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                if (map.getOrDefault(pattern.charAt(i), "empty") != "empty") {

                    if (!map.get(pattern.charAt(i)).equals(values[i])) {
                        // System.out.println(map.get(pattern.charAt(i)) +" : "+ values[i]);
                        return false;
                    }
                }
                map.put(pattern.charAt(i), values[i]);

            }
            return true;
        }
    }
}
