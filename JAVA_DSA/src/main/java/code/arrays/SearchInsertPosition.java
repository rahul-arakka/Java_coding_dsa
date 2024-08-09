//https://leetcode.com/problems/search-insert-position/
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.

package code.arrays;

class SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            // int res = 0;
            int i = 0;
            while (i < nums.length) {
                if (nums[i] == target) {
                    return i;
                }
                if (nums[i] > target)
                    return (i);
                i++;
            }
            return i;
        }
    }
}