//https://leetcode.com/problems/license-key-formatting/description/?envType=problem-list-v2&envId=string&difficulty=EASY
//You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.
//
//We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
//
//Return the reformatted license key.

package code.strings;

public class LiscenseKeyFormatting {
    class Solution {
        public String licenseKeyFormatting(String s, int k) {
            // char[] ch = s.toCharArray();
            // int n = ch.length;
            // String res = "";
            // int count = 0;
            // for(int i=ch.length-1;i>=0;i--){
            //     if(ch[i] == '-'){
            //         continue;
            //     }
            //     if(count == k){
            //         res = "-" + res;
            //         count = 0;
            //     }
            // count++;
            // if(ch[i] >= 90 && ch[i] <= 122)
            //     res = String.valueOf(ch[i]).toUpperCase() +  res;
            // else    res = String.valueOf(ch[i]) + res;
            // }

            // return res;

            //Approach 2
            final StringBuilder sb = new StringBuilder();
            int count = 0;

            for (int i = s.length() - 1; i >= 0; --i) {
                char c = s.charAt(i);

                if (c == '-')
                    continue;

                if (!Character.isDigit(c) && c > 90)
                    c -= 32;

                if (count == k) {
                    sb.append('-');
                    count = 0;
                }

                sb.append(c);
                count++;
            }

            return sb.reverse().toString();
        }
    }
}
