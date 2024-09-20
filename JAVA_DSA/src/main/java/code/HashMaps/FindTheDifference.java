//https://leetcode.com/problems/find-the-difference/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
//You are given two strings s and t.
//
//String t is generated by random shuffling string s and then add one more letter at a random position.
//
//Return the letter that was added to t.

// Runs with 11ms & beats 17.55%

package code.HashMaps;

import java.util.ArrayList;
import java.util.List;

public class FindTheDifference {
    class Solution {
        public char findTheDifference(String s, String t) {
            // if()
//            List<Character> list = new ArrayList<>();
//            for (int i = 0; i < s.length(); i++) {
//                list.add(s.charAt(i));
//            }
//            for (int i = 0; i < t.length(); i++) {
//                if (!list.contains(t.charAt(i)))
//                    return t.charAt(i);
//            }
//            return 'a';

            //  Approach 1 Enhanced

            List<Character> list = new ArrayList<>();
            for(int i=0;i<t.length();i++){
                list.add(t.charAt(i));
            }
            for(int i=0;i<s.length();i++){
                list.remove(Character.valueOf(s.charAt(i)));
            }
            // System.out.println(list.toString());
            return list.get(0);
        }

    }
}
