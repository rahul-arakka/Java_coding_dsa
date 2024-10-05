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
            for (int i = 0; i < n - 10; i++) {
                int l = i + 10;
                String str1 = s.substring(i, l);

                if (s.lastIndexOf(str1) != i && !list.contains(str1)) {
                    list.add(str1);
                }
            }
            return list;
        }
    }
}
