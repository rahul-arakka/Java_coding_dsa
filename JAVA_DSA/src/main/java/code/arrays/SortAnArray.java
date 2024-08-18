//https://30dayscoding.com/dsa
//https://leetcode.com/problems/sort-an-array/description/
//Given an array of integers nums, sort the array in ascending order and return it.
//You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

// This approach is called MERGE SORT & has time complexity of O(nlogn) and uses space 'N' (int array 'merge').

package code.arrays;

public class SortAnArray {
    class Solution {
        public static void conquor(int[] nums, int si, int mid, int ei) {

            int[] merge = new int[ei - si + 1];

            int idx1 = si;
            int idx2 = mid + 1;
            int x = 0;
            while (idx1 <= mid && idx2 <= ei) {
                if (nums[idx1] <= nums[idx2]) {
                    merge[x++] = nums[idx1++];
                } else {
                    merge[x++] = nums[idx2++];
                }
            }

            while (idx1 <= mid) {
                merge[x++] = nums[idx1++];
            }
            while (idx2 <= ei) {
                merge[x++] = nums[idx2++];
            }
            for (int i = 0, j = si; i < merge.length; i++, j++) {
                nums[j] = merge[i];
            }

        }

        public static void divide(int[] nums, int si, int ei) {
            if (si >= ei) {
                return;
            }
            int mid = si + (ei - si) / 2; // .: (si + ei)/2 - this could lead to out of range for int if sum of both the values exceed the max value of int here.
            divide(nums, si, mid);
            divide(nums, mid + 1, ei);
            // Conquor method to implement the sort logic and merge the array.
            conquor(nums, si, mid, ei);

        }

        public int[] sortArray(int[] nums) {
            int n = nums.length;
            divide(nums, 0, n - 1);
            return nums;
        }
    }
}
