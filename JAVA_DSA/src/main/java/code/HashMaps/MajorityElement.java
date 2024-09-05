//https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=hash-table
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// This approach runs with 21ms & beats 9.27% - using hashmaps

package code.HashMaps;

public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int max = 0;
            int res = 0;
            for (int val : nums) {
                map.put(val, map.getOrDefault(val, 0) + 1);
                if ((int) map.get(val) > max) {
                    max = (int) map.get(val);
                    res = val;
                }

            }
            return res;
        }
    }
}
