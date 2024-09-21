//https://leetcode.com/problems/to-lower-case/description/?envType=problem-list-v2&envId=string&difficulty=EASY
//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

package code.strings.ToLowerCase;

public class ToLowerCase {
    class Solution {
        public String toLowerCase(String s) {
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 65 && ch <= 90) {
                    ch += 32;
                }
                ans += String.valueOf(ch);

            }
            return ans;
        }
    }
}
