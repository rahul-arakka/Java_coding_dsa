//https://leetcode.com/problems/relative-ranks/?envType=problem-list-v2&envId=sorting&difficulty=EASY

//You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
//
//The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
//
//The 1st place athlete's rank is "Gold Medal".
//The 2nd place athlete's rank is "Silver Medal".
//The 3rd place athlete's rank is "Bronze Medal".
//For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
//Return an array answer of size n where answer[i] is the rank of the ith athlete.


package code.Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
    class Solution {
        public String[] findRelativeRanks(int[] score) {
            Map<Integer, Integer> map = new HashMap<>();
            String[] ans = new String[score.length];
            int x = 0;
            for (int i : score) {
                map.put(i, x++);
            }
            Arrays.sort(score);
            // Collections.reverse(score);
            int j = score.length - 1;
            for (int i : score) {
                if (j == 0)
                    ans[map.get(i)] = "Gold Medal";
                else if (j == 1)
                    ans[map.get(i)] = "Silver Medal";
                else if (j == 2)
                    ans[map.get(i)] = "Bronze Medal";
                else
                    ans[map.get(i)] = j + 1 + "";
                j--;
            }
            return ans;

        }
    }
}
