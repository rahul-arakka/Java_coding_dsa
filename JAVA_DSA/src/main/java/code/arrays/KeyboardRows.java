//https://leetcode.com/problems/keyboard-row/description/?envType=problem-list-v2&envId=array&difficulty=EASY
//Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
//
//        In the American keyboard:
//
//        the first row consists of the characters "qwertyuiop",
//        the second row consists of the characters "asdfghjkl", and
//        the third row consists of the characters "zxcvbnm".

package code.arrays;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRows {
    class Solution {
        public String[] findWords(String[] words) {
            String row1 = "qwertyuiopQWERTYUIOP";
            String row2 = "asdfghjklASDFGJKL";
            String row3 = "zxcvbnmZXCVBNM";

            List<String> keywords = new ArrayList<>();

            int x = 0;
            for (String key : words) {
                if (row1.contains(String.valueOf(key.charAt(0)))) {
                    boolean flag = true;
                    for (int i = 1; i < key.length(); i++) {
                        if (!row1.contains(String.valueOf(key.charAt(i)))) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        keywords.add(key);
                    }
                } else if (row2.contains(String.valueOf(key.charAt(0)))) {

                    boolean flag = true;
                    for (int i = 1; i < key.length(); i++) {
                        if (!row2.contains(String.valueOf(key.charAt(i)))) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        keywords.add(key);
                    }
                } else {
                    boolean flag = true;
                    for (int i = 1; i < key.length(); i++) {
                        if (!row3.contains(String.valueOf(key.charAt(i)))) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        keywords.add(key);
                    }
                }
            }
            String[] ans = new String[keywords.size()];
            int j = 0;
            for (String val : keywords)
                ans[j++] = val;
            return ans;
        }
    }
}
