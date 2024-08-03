//https://30dayscoding.com/dsa
//https://leetcode.com/problems/3sum/description/
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

package code.twoPointers;

class ThreeSum {

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();

            int n = nums.length;
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    for (int k = 0; k < n; k++) {
                        if (j == k) continue;
                        List<Integer> res = new ArrayList<>();
                        int sum = nums[i] + nums[j] + nums[k];
                        // System.out.println("- Printing nums of i, j, k : "+ nums[i] +" " + nums[j] +" "+ nums[k] + " Sum: " + sum);
                        if (i != j && j != k && i != k && sum == 0) {
                            res.add(nums[i]);
                            res.add(nums[j]);
                            res.add(nums[k]);
                            Collections.sort(res);
                            // System.out.println("--- Printing res : "+ res);
                            if (!ans.contains(res))
                                ans.add(res);
                        }

                    }
                }

                // System.out.println("--- Printing ans : "+ ans);
            }
            return ans;
        }
    }

}