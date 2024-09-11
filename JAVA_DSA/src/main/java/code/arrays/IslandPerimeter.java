//https://leetcode.com/problems/island-perimeter/description/?envType=problem-list-v2&envId=array&difficulty=EASY
//You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
//
//Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
//
//The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

package code.arrays;

public class IslandPerimeter {
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            int ans = 0;
            int up, down, left, right;

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (grid[r][c] == 1) {
                        if (r == 0) {
                            up = 1;
                        } else {
                            up = (grid[r - 1][c] == 0) ? 1 : 0;
                        }

                        if (c == 0) {
                            left = 1;
                        } else {
                            left = (grid[r][c - 1] == 0) ? 1 : 0;
                        }

                        if (r == rows - 1) {
                            down = 1;
                        } else {
                            down = (grid[r + 1][c] == 0) ? 1 : 0;
                        }

                        if (c == cols - 1) {
                            right = 1;
                        } else {
                            right = (grid[r][c + 1] == 0) ? 1 : 0;
                        }

                        ans += up + left + down + right;
                    }
                }
            }
            return ans;
        }
    }

}
