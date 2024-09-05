//https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=hash-table
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// This approach runs with 7ms & beats 38.08% - using Arrays.sort()

package code.HashMaps;

public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {

            Arrays.sort(nums);
            int max = 0, len = 1, ans = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] == nums[i]) {
                    len++;
                } else {
                    if (len > max) {
                        ans = nums[i - 1];
                        max = len;
                    }
                    len = 1;
                }
            }
            if (len > max)
                ans = nums[nums.length - 1];
            return ans;
        }
    }
}
