//https://30dayscoding.com/dsa - Array & Hashing
//https://leetcode.com/problems/valid-anagram/submissions/1336587937/
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

package code.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    class Solution {
        public boolean isAnagram(String s, String t) {

            HashMap<Character, Integer> map = new HashMap<>();
            int count = 0;
            char[] arr = s.toCharArray();

            for (char key : arr) {
                count = map.containsKey(key) ? map.get(key) : 0;
                map.put(key, count + 1);
            }

            char[] arr2 = t.toCharArray();
            for (char key : arr2) {
                if (map.containsKey(key))
                    map.put(key, map.get(key) - 1);
                else
                    return false;
            }

            for (Map.Entry entry : map.entrySet()) {
                if ((int) entry.getValue() != 0) {
                    return false;
                }
            }
            return true;

        }
    }

}
