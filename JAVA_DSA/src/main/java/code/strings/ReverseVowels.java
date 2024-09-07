//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=problem-list-v2&envId=string
//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

package code.strings;

public class ReverseVowels {
    class Solution {
        public String reverseVowels(String s) {
            String[] str = s.split("");
            String vowel = "aeiou";
            int i = 0, j = str.length - 1;
            while (i < j) {
                if (!vowel.contains(str[i])) {
                    i++;
                } else if (!vowel.contains(str[j])) {
                    j--;
                } else {
                    String tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                    i++;
                    j--;
                }
            }
            String result = "";
            for (String val : str)
                result += val;
            return result;
        }
    }
}
