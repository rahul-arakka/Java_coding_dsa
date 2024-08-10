//https://30dayscoding.com/dsa
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
//Given a string s, find the length of the longest substring without repeating characters.

// In this approach we are creating a subList of original list after removing the elements from index 0 to the duplicate element.

package code.twoPointers;

class LongestSubstring {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int length = 0;
            List<Character> alist = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                if (alist.contains(s.charAt(i))) {
                    int index = alist.indexOf(s.charAt(i));
                    alist.remove(index);
                    alist.subList(0, index).clear();
                }
                alist.add(s.charAt(i));
                length = Math.max(length, alist.size());


            }
            return length;

        }
    }
}