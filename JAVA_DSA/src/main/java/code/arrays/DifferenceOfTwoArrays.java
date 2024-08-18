//https://30dayscoding.com/dsa
//https://leetcode.com/problems/find-the-difference-of-two-arrays/

//Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

//answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
//answer[1] is a list of all distinct integers in nums2 which are not present in nums1.

//Note that the integers in the lists may be returned in any order.

package code.arrays;

public class DifferenceOfTwoArrays {
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<Integer> l1 = new ArrayList<>();
            // List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(nums2));

            for (int i = 0; i < nums1.length; i++) {
                l1.add(nums1[i]);
            }
            List<Integer> l2 = new ArrayList<>();
            // List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(nums2));

            for (int i = 0; i < nums2.length; i++) {
                l2.add(nums2[i]);
            }

            List<List<Integer>> result = new ArrayList<>();

            List<Integer> val = new ArrayList<>();
            for (int i = 0; i < l1.size(); i++) {
                if (!l2.contains(l1.get(i)) && !val.contains(l1.get(i))) {
                    val.add(l1.get(i));
                }
            }
            result.add(val);

            List<Integer> val2 = new ArrayList<>();
            for (int i = 0; i < l2.size(); i++) {

                if (!l1.contains(l2.get(i)) && !val2.contains(l2.get(i))) {
                    val2.add(l2.get(i));
                }
            }
            result.add(val2);
            return result;
        }
    }
}
