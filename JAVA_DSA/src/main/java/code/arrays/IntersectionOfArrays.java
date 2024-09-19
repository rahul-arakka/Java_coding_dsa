//https://leetcode.com/problems/intersection-of-two-arrays/submissions/1394699781/?envType=problem-list-v2&envId=sorting&difficulty=EASY
//Given two integer arrays nums1 and nums2, return an array of their
//intersection. Each element in the result must be unique and you may return the result in any order.


package code.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfArrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            // List<Integer> list1 = new ArrayList<>();
            // for(int val : nums1){
            //     list1.add(val);
            // }
            // // List<Integer> list2 = new ArrayList<>(nums2);
            // List<Integer> res = new ArrayList<>();
            // for(int i : nums2){
            //     if(list1.contains(i)){
            //         if(!res.contains(i)){
            //             res.add(i);
            //         }
            //     }

            // }
            // int[] ans = new int[res.size()];
            // for(int i=0;i<ans.length;i++)
            //     ans[i] = res.get(i);

            // Approach 2
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> list1 = new ArrayList<>();
            for (int i : nums1) {
                map.put(i, 1);
            }
            for (int i : nums2) {
                if (map.containsKey(i) && !list1.contains(i)) {
                    list1.add(i);
                }
            }
            int[] ans = new int[list1.size()];
            int i = 0;
            for (int val : list1) {
                ans[i++] = val;
            }
            return ans;

        }
    }
}
