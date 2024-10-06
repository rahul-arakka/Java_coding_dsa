//https://leetcode.com/problems/ransom-note/?envType=problem-list-v2&envId=counting&difficulty=EASY
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.

package code.strings;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            // Map<Character, Integer> map =  new HashMap<>();
            // for(int i=0;i<m.length();i++){
            //     map.put(m.charAt(i), map.getOrDefault(m.charAt(i), 0)+1);
            // }
            // for(int i=0;i<r.length();i++){
            //     if(!map.containsKey(r.charAt(i)) || map.get(r.charAt(i)) == 0){
            //         return false;
            //     }
            //     map.put(r.charAt(i), map.get(r.charAt(i))-1);
            // }

            // return true;

            //Approach 2

            if (ransomNote.length() > magazine.length()) return false;
            int[] alphabets_counter = new int[26];

            for (char c : magazine.toCharArray())
                alphabets_counter[c - 'a']++;

            for (char c : ransomNote.toCharArray()) {
                if (alphabets_counter[c - 'a'] == 0) return false;
                alphabets_counter[c - 'a']--;
            }
            return true;
        }
    }
}
