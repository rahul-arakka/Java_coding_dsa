//https://leetcode.com/problems/intersection-of-two-arrays/submissions/1394699781/?envType=problem-list-v2&envId=sorting&difficulty=EASY
//Given two integer arrays nums1 and nums2, return an array of their
//intersection. Each element in the result must be unique and you may return the result in any order.



package code.arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            List<Integer> list1 = new ArrayList<>();
            for (int val : nums1) {
                list1.add(val);
            }
            // List<Integer> list2 = new ArrayList<>(nums2);
            List<Integer> res = new ArrayList<>();
            for (int i : nums2) {
                if (list1.contains(i)) {
                    if (!res.contains(i)) {
                        res.add(i);
                    }
                }

            }
            int[] ans = new int[res.size()];
            for (int i = 0; i < ans.length; i++)
                ans[i] = res.get(i);
            // ans = list1.toArray();
            return ans;

        }
    }
}
