//https://30dayscoding.com/dsa
//https://leetcode.com/problems/3sum/description/
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

package code.twoPointers;

class ThreeSum {

    class Solution {class Solution {

        //2 pointers
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            LinkedList<List<Integer>> sol = new LinkedList<List<Integer>>();

            for (int i = 0; i < nums.length - 2; i++) {
                //Only consider non-duplicate elements for i
                if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                    int target = 0 - nums[i];
                    int left = i + 1;
                    int right = nums.length - 1;

                    while (left < right) {
                        if (nums[left] + nums[right] == target) {
                            ArrayList<Integer> miniSol = new ArrayList<>();
                            miniSol.add(nums[i]);
                            miniSol.add(nums[left]);
                            miniSol.add(nums[right]);
                            sol.add(miniSol);
                            while (left < right && nums[left] == nums[left + 1]) {
                                left++;
                            }
                            while (left < right && nums[right] == nums[right - 1]) {
                                right--;
                            }
                            left++;
                            right--;
                        } else if (nums[left] + nums[right] > target) {
                            right--;
                        } else {
                            left++;
                        }
                    }
                }
            }

            return sol;
        }
    }


    }