//https://30dayscoding.com/dsa
//https://leetcode.com/problems/3sum/description/
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

// This is optimal approach, all test cases are passed.

package code.twoPointers;

class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> dup = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
                    int target = 0 - nums[i];
                    int l = i + 1, r = nums.length - 1;
                    while (l < r) {
                        if (nums[l] + nums[r] == target) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[l]);
                            list.add(nums[r]);
                            ans.add(list);

                            while (l < r && nums[l] == nums[l + 1]) l++;
                            while (l < r && nums[r] == nums[r - 1]) r--;
                            l++;
                            r--;

                        } else if (nums[l] + nums[r] < target) {
                            l++;
                        } else if (nums[l] + nums[r] > target) {
                            r--;
                        }
                    }
                }
            }
            return ans;
        }
    }
}