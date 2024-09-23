//https://leetcode.com/problems/di-string-match/description/?envType=problem-list-v2&envId=string&difficulty=EASY
//A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
//
//s[i] == 'I' if perm[i] < perm[i + 1], and
//s[i] == 'D' if perm[i] > perm[i + 1].
//Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.


package code.strings;

public class DIStringMatch {
    class Solution {
        public int[] diStringMatch(String s) {
            int n = s.length();
            int[] res = new int[n + 1];
            int i = 0, j = n, x = 0;
            // char ch;
            while (i <= j && x < n) {
                if (s.charAt(x) == 'I') {
                    res[x] = i;
                    i++;
                } else {
                    res[x] = j;
                    j--;
                }
                x++;
            }
            res[x] = j;
            return res;
        }
    }
}
