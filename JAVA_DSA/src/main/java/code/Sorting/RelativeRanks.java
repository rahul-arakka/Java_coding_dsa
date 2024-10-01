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
            int[] vsort = Arrays.copyOf(score, score.length);

            Arrays.sort(vsort);
            for (int i = 0; i < vsort.length / 2; i++) {
                int temp = vsort[i];
                vsort[i] = vsort[vsort.length - 1 - i];
                vsort[vsort.length - 1 - i] = temp;
            }

            HashMap<Integer, String> rankMap = new HashMap<>();
            for (int i = 0; i < score.length; i++) {
                if (i == 0)
                    rankMap.put(vsort[i], "Gold Medal");
                else if (i == 1)
                    rankMap.put(vsort[i], "Silver Medal");
                else if (i == 2)
                    rankMap.put(vsort[i], "Bronze Medal");
                else
                    rankMap.put(vsort[i], String.valueOf(i + 1));
            }

            String[] ranks = new String[score.length];
            for (int i = 0; i < score.length; i++) {
                ranks[i] = rankMap.get(score[i]);
            }

            return ranks;
        }
    }
}
