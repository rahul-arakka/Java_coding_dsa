//https://30dayscoding.com/dsa - Array & Hashin
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//https://leetcode.com/problems/contains-duplicate/description/


package code.HashMaps;

import java.util.HashMap;

public class ContainsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int val: nums){
                if(map.get(val) != null)    return true;
                map.put(val, 1);
                // System.out.println(map.get(val));
            }
            return false;

        }
    }
}
