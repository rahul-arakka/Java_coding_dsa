//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=problem-list-v2&envId=string
//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
// This approach works for all test cases with 5ms & beats 39.16%

package code.strings;

public class ReverseVowels {
    class Solution {
        public String reverseVowels(String s) {
            char[] str = s.toCharArray();
            String vowel = "aeiouAEIOU";
            int i = 0, j = str.length - 1;
            while (i < j) {
                if (!vowel.contains(String.valueOf(str[i]))) {      //As we are using inbuilt too much functions here like .contains() & String.valueOf() so the execution is little slower.
                    i++;                                            // Instead of calling functions, if we directly check the characters, it will be faster.
                } else if (!vowel.contains(String.valueOf(str[j]))) {
                    j--;
                } else {
                    char tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                    i++;
                    j--;
                }
            }
            // String result = "";      :- As we were using an additional for loop the program runs an extra space and reduces performance
            // for(char val : str)
            //     result += String.valueOf(val);
            return new String(str); // Using direct new string() will be faster, but this only work if the provided array is Char array and does not work in case of string array.
            // return String.valueOf(str)   :- alternative of above command, but works same way.
        }
    }
}
