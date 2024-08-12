//https://30dayscoding.com/dsa
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//You must write an algorithm that runs in O(log n) time.

// This approach runs in O(log n) time.

package code.BinarySearch;

public class MinimunInRotatedArray {
    class Solution {
        public int findMin(int[] nums) {
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                if (nums[l] <= nums[r]) {
                    return nums[l];
                }
                int mid = (l + r) / 2;
                if (nums[mid] >= nums[l])
                    l = mid + 1;
                else
                    r = mid;
            }
            return 0;
        }
    }
}
