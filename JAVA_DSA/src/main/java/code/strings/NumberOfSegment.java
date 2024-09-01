//https://leetcode.com/problems/number-of-segments-in-a-string/
//Given a string s, return the number of segments in the string.
//A segment is defined to be a contiguous sequence of non-space characters.

package code.strings;

public class NumberOfSegment {
    class Solution {
        public int countSegments(String s) {
            s = s.trim();
            if (s.length() == 0) return 0;
            String[] spl = s.split("\\s+");
            return spl.length;
        }
    }
}
