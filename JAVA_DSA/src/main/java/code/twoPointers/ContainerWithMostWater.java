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
            int ind = 0, vol = 1, max = 0, num = height[0];
            for (int i = 0; i < height.length; i++) {
                if (height[i] > num) {
                    num = height[i];
                    ind = 0;
                }
                vol = ind * height[i];
                if (vol > max) {
                    max = vol;
                }
                ind++;
                // System.out.println("printing ind :" + ind +" height[i] : "+ height[i] + " vol : "+ vol);

            }
            return max;
        }
    }
}