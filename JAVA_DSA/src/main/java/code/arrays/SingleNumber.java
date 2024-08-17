//https://leetcode.com/problems/single-number/description/
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

// This approach uses HashMap for checking count of each key and printing the one that has value 1.

package code.arrays;

public class SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry ent : map.entrySet()) {
                if ((int) ent.getValue() == 1)
                    return (int) ent.getKey();
            }
            return 0;
        }
    }
}
