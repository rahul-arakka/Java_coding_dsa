//https://leetcode.com/problems/repeated-dna-sequences/?envType=problem-list-v2&envId=sliding-window&difficulty=MEDIUM
//The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
//
//For example, "ACGAATTCCG" is a DNA sequence.
//When studying DNA, it is useful to identify repeated sequences within the DNA.
//
//Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

package code.SlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {

            Set<String> set = new HashSet<>();
            Set<String> ans = new HashSet<>();


            int i = 0;
            int j = 0;
            StringBuilder sb = new StringBuilder();

            while (j < s.length()) {

                sb.append(s.charAt(j));

                if (j - i + 1 < 10) {
                    j++;
                } else {
                    if (set.contains(sb.toString())) {
                        ans.add(sb.toString());
                    } else {
                        set.add(sb.toString());
                    }
                    sb.delete(0, 1);
                    i++;
                    j++;
                }

            }
            List<String> res = new ArrayList<>(ans);
            return res;

        }
    }
}
