//https://30dayscoding.com/dsa
//https://leetcode.com/problems/container-with-most-water/
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Notice that you may not slant the container.

package code.twoPointers;

class ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int max = 0, vol = 0, left = 0, right = height.length - 1, res = 0;
            while (left < right) {
                int ind = right - left;
                vol = ind * Math.min(height[left], height[right]);
                res = Math.max(res, vol);

                if ((height[left]) < height[right]) {
                    left++;

                } else {
                    right--;
                }

            }
            return res
        }
    }