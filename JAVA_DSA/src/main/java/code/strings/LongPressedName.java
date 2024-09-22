//https://leetcode.com/problems/long-pressed-name/?envType=problem-list-v2&envId=string&difficulty=EASY
//Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
//
//You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.


package code.strings;

public class LongPressedName {
    class Solution {
        public boolean isLongPressedName(String name, String typed) {
            if (typed.length() < name.length())
                return false;

            int i = 0, j = 0;
            while (i < name.length() && j < typed.length()) {
                if (name.charAt(i) == typed.charAt(j)) {
                    i++;
                }
                j++;
            }
            if (i == name.length() && j == typed.length())
                return true;
            return false;
        }
    }
}
