//https://leetcode.com/problems/alternating-groups-i/?envType=problem-list-v2&envId=sliding-window&difficulty=EASY

//There is a circle of red and blue tiles. You are given an array of integers colors. The color of tile i is represented by colors[i]:
//
//colors[i] == 0 means that tile i is red.
//colors[i] == 1 means that tile i is blue.
//Every 3 contiguous tiles in the circle with alternating colors (the middle tile has a different color from its left and right tiles) is called an alternating group.
//
//Return the number of alternating groups.
//
//Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.

package code.SlidingWindow;

public class AlternatingGroupsI {
    class Solution {
        public int numberOfAlternatingGroups(int[] colors) {
            int n = colors.length;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (colors[(i - 1 + n) % n] != colors[i] && colors[(i + 1 + n) % n] == colors[(i - 1 + n) % n]) {
                    count++;
                }
            }
            return count;
        }
    }
}
