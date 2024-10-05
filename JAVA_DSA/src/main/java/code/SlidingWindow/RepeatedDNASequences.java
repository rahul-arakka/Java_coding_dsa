//https://leetcode.com/problems/repeated-dna-sequences/?envType=problem-list-v2&envId=sliding-window&difficulty=MEDIUM
//The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
//
//For example, "ACGAATTCCG" is a DNA sequence.
//When studying DNA, it is useful to identify repeated sequences within the DNA.
//
//Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

// Use of in-built string functions are complex & increases time complexity/
// Hence we use StringBuilder (.append() & .delete()) methods, which are more optimal in terms of time and space complexity both.

// In this approach we are using HashSet as because adding, removing & searching in HashSets & HashMaps are less time consuming then string methods.
// Creating substring and searching in the same string repeatedly increase complexity, wherein doing the same in Sets or Maps takes less time.
//Hence this solution is the most optimzed amoung the other solutions.

package code.SlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            Set seen = new HashSet(), repeated = new HashSet();
            for (int i = 0; i + 9 < s.length(); i++) {
                String ten = s.substring(i, i + 10);
                if (!seen.add(ten))
                    repeated.add(ten);
            }
            return new ArrayList(repeated);
        }
    }
}
