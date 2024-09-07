//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=problem-list-v2&envId=string
//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
// This approach works for all test cases with 2ms & beats 98.69%

package code.strings;

public class ReverseVowels {
    class Solution {
        public String reverseVowels(String s) {

            char[] chars = s.toCharArray();

            int start = 0 ;

            int end = s.length()-1;

            while (start<end){
                while (start < end && !isVowel(chars[start])) {
                    start++;
                }

                while (start < end && !isVowel(chars[end])) {
                    end--;
                }

                if (start < end) {
                    swap(chars, start, end);
                    start++;
                    end--;
                }

            }

            return new String(chars);
        }

        private void swap(char[] word, int start, int end){
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
        }

        private boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        }
    }
}
