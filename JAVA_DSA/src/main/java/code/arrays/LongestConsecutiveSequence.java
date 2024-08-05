//https://30dayscoding.com/dsa
//https://leetcode.com/problems/longest-consecutive-sequence/
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.

//This solution is valid on for the test cases which doesn't contain and duplicate values in array;

package code.arrays;

class LongestConsecutiveSequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            if(nums.length == 0)    return 0;
            Arrays.sort(nums);
            int count = 1, prevCount = 1;
            for(int i=0; i < nums.length-1;i++){
                if(nums[i+1] == nums[i]+1){
                    count++;
                }else{
                    if(count > prevCount){
                        prevCount = count;
                    }
                    // prevCount = count;
                    count = 1;
                    // value = nums[i];
                }

            }
            if (count> prevCount){
                return count;
            }
            return prevCount;
        }
    }
}