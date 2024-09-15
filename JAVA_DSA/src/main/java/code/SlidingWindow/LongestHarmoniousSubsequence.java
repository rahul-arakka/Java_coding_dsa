//https://leetcode.com/problems/longest-harmonious-subsequence/?envType=problem-list-v2&envId=sliding-window&difficulty=EASY
//We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
//
//        Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
//
//        A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

package code.SlidingWindow;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    class Solution {
        public int findLHS(int[] nums) {
            int ret=0;
            HashMap<Integer,Integer> hm = new HashMap();
            for(int num : nums){
                hm.put(num,hm.getOrDefault(num,0)+1);
            }

            for(int key : hm.keySet()){
                if(hm.containsKey(key+1))
                {
                    ret=Math.max(ret, hm.get(key) + hm.get(key+1));
                }
            }
            return ret;
        }

    }
}
