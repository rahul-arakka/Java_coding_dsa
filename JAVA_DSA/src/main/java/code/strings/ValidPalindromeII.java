//https://30dayscoding.com/dsa
//https://leetcode.com/problems/valid-palindrome-ii/description/
//Given a string s, return true if the s can be palindrome after deleting at most one character from it.

// TLE

package code.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidPalindromeII {
    class Solution {
        public boolean validPalindrome(String s) {
            // String val = s.reverse();
            String reversedStr = "";

            for (int i = 0; i < s.length(); i++) {
                reversedStr = s.charAt(i) + reversedStr;
            }
            if (s.equals(reversedStr)) return true;

            List<String> list = new ArrayList<>();
            String[] arr = s.split("");

            list = Arrays.asList(arr);
            for (int i = 0; i < list.size(); i++) {
                ArrayList<String> al = new ArrayList<>(list);
                // al = list;
                al.remove(i);
                // String str = al.toString();
                String str2 = "", str3 = "";

                for (int j = 0; j < al.size(); j++) {
                    str2 += al.get(j);
                    str3 += al.get(al.size() - 1 - j);
                }
                // System.out.println("Printing s: "+s+" and reverse : "+ str2);
                if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
            //     int i = 0, j = s.length() - 1;
            //     while(i < j)
            //         if(s.charAt(i) == s.charAt(j)) {
            //             i += 1;
            //             j -= 1;
            //         }else
            //             return validPalindromeUtil(s, i + 1, j) || validPalindromeUtil(s, i, j - 1);
            //     return true;
            // }

            // boolean validPalindromeUtil(String s, int i, int j) {
            //     while(i < j)
            //         if(s.charAt(i) == s.charAt(j)) {
            //             i += 1;
            //             j -= 1;
            //         } else {
            //             return false;
            //         }

            //     return true;
        }
    }


}
