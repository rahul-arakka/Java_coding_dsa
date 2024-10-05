//https://leetcode.com/problems/repeated-dna-sequences/?envType=problem-list-v2&envId=sliding-window&difficulty=MEDIUM
//The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
//
//For example, "ACGAATTCCG" is a DNA sequence.
//When studying DNA, it is useful to identify repeated sequences within the DNA.
//
//Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

package code.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class RepeatedDNASequences {
    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            int n = s.length();
            List<String> list = new ArrayList<>();

            if (n < 10) {
                return list;
            }
            StringBuilder sb = new StringBuilder(s.substring(0, 10));
            for (int i = 0; i < n - 10; i++) {
                if (s.lastIndexOf(sb.toString()) != i && !list.contains(sb.toString())) {
                    list.add(sb.toString());
                }
                sb.delete(0, 1);
                sb.append(s.charAt(i + 10));
            }
            return list;
        }
    }
}
