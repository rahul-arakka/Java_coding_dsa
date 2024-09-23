//https://leetcode.com/problems/sort-the-people/description/?envType=problem-list-v2&envId=string&difficulty=EASY
//You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
//
//For each index i, names[i] and heights[i] denote the name and height of the ith person.
//
//Return names sorted in descending order by the people's heights.

package code.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {
    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            Map<Integer, String> map = new HashMap<>();
            for (int i = 0; i < names.length; i++) {
                map.put(heights[i], names[i]);
            }
            Arrays.sort(heights);
            // Arrays.sort(heights, Collections.reverseOrder());
            int j = names.length - 1;
            String[] result = new String[names.length];
            for (int i = 0; i < heights.length; i++) {
                // System.out.println(map.get(heights[i]));
                result[j--] = map.get(heights[i]);
            }
            return result;
        }
    }
}
