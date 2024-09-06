//https://leetcode.com/problems/pascals-triangle/description/?envType=problem-list-v2&envId=array
//Given an integer numRows, return the first numRows of Pascal's triangle.

package code.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> mainList = new ArrayList<>();
            int x = 1;
            int incr = 1;
            while (incr <= numRows) {
                int[] temp = new int[incr];
                if (incr == 1) {
                    temp[0] = 1;
                } else if (incr == 2) {
                    temp[0] = 1;
                    temp[1] = 1;
                } else {
                    temp[0] = 1;
                    for (int i = 1; i < (incr + 1) / 2; i++) {
                        temp[i] = mainList.get(x).get(i) + mainList.get(x).get(i - 1);
                        temp[incr - 1 - i] = mainList.get(x).get(i) + mainList.get(x).get(i - 1);
                    }
                    temp[incr - 1] = 1;
                    x++;
                }
                incr++;
                List<Integer> list = new ArrayList<>();
                for (int val : temp)
                    list.add(val);
                mainList.add(list);
            }
            return mainList;
        }
    }
}
