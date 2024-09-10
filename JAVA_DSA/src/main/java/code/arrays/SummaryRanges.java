//https://leetcode.com/problems/summary-ranges/?envType=problem-list-v2&envId=array&difficulty=EASY
//You are given a sorted unique integer array nums.
//
//A range [a,b] is the set of all integers from a to b (inclusive).
//
//Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums

//Approach 2 works for All test cases with 0ms & beats 100% just by using StringBuilder & .append() methods, improves efficiency.

package code.arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    class Solution {
        public List<String> summaryRanges(int[] nums) {

            List<String> list = new ArrayList<>();
            if (nums.length == 0) return list;
//            String str = String.valueOf(nums[0]);
//            int num = nums[0], len = 1;
//            for (int i = 1; i < nums.length; i++) {
//                if (num + 1 == nums[i]) {
//                    len++;
//                    num++;
//                } else {
//                    if (len > 1) {
//                        str += "->" + String.valueOf(nums[i - 1]);
//                    }
//
//                    list.add(str);
//                    str = String.valueOf(nums[i]);
//                    len = 1;
//                    num = nums[i];
//                }
//            }
//            if (len > 1) {
//                str += "->" + String.valueOf(nums[nums.length - 1]);
//            }
//
//            list.add(str);
//            return list;
            // Approach 2

            int left = 0, right = 0;
            // String s = "";
            StringBuilder s = new StringBuilder();
            while(right+1 < nums.length){
                if(nums[right]+1 != nums[right+1]){
                    if(left == right){
                        s.append(nums[right]);
                    }else{
                        s.append(nums[left]).append("->").append(nums[right]);
                    }
                    left = right+1;

                    list.add(s.toString());
                    s.setLength(0);
                }
                right++;
            }
            if(left == right){
                s.append(nums[nums.length-1]);
            }else{
                s.append(nums[left]).append("->").append(nums[nums.length-1]);
            }
            // left = right+1;

            list.add(s.toString());

            return list;
        }
    }
}
