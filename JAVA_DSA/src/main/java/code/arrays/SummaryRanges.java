//https://leetcode.com/problems/summary-ranges/?envType=problem-list-v2&envId=array&difficulty=EASY
//You are given a sorted unique integer array nums.
//
//A range [a,b] is the set of all integers from a to b (inclusive).
//
//Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums


package code.arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> list = new ArrayList<>();
            String str = String.valueOf(nums[0]);
            int num = nums[0], len = 1;
            for (int i = 1; i < nums.length; i++) {
                if (num + 1 == nums[i]) {
                    len++;
                    num++;
                } else {
                    if (len > 1) {
                        str += "->" + String.valueOf(nums[i - 1]);
                    }

                    list.add(str);
                    str = String.valueOf(nums[i]);
                    len = 1;
                    num = nums[i];
                }
            }
            if (len > 1) {
                str += "->" + String.valueOf(nums[nums.length - 1]);
            }

            list.add(str);
            return list;
        }
    }
}
