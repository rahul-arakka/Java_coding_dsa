//https://leetcode.com/problems/merge-intervals/description/?envType=problem-list-v2&envId=array
//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
// and return an array of the non-overlapping intervals that cover all the intervals in the input.

package code.arrays;

public class MergeIntervals {
    class Solution {
        public int[][] merge(int[][] intervals) {
            int[][] res = new int[intervals.length][2];
            int x = 0, j = 0, count = 0;
            while (j < intervals.length - 1) {
                if (res[x][0] == 0) {
                    res[x][0] = intervals[j][0];
                }
                if (intervals[j][0] <= res[x][0]) {
                    res[x][0] = intervals[j][0];
                }
                if (intervals[j][1] < intervals[j + 1][0]) {
                    res[x][1] = intervals[j][1];
                    x++;
                }
                if (intervals[j][1] >= intervals[j + 1][0])
                    count++;
                j++;
            }

            if (res[x][0] == 0) {
                res[x][0] = intervals[j][0];
            }
            res[x][1] = intervals[j][1];

            int[][] arr = new int[intervals.length - count][2];
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = res[i][0];
                arr[i][1] = res[i][1];
            }
            return arr;

        }
    }
}
