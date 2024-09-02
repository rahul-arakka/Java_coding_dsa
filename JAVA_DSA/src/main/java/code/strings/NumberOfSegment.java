//https://leetcode.com/problems/number-of-segments-in-a-string/
//Given a string s, return the number of segments in the string.
//A segment is defined to be a contiguous sequence of non-space characters.

package code.strings;

public class NumberOfSegment {
    class Solution {
        public int countSegments(String s) {
            s = s.trim();
            int len = 0;
            boolean flag = false;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) == ' '){
                    flag = true;
                    len++;
                }

            }

            if(flag)    len++;
            if(!flag && s.length() != 0) return 1;

            return len;
        }
    }
}
