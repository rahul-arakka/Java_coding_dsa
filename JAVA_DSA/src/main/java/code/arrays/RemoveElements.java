//https://leetcode.com/problems/remove-element/
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.

package code.arrays;
class RemoveElements {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int count = 0;
            Arrays.sort(nums);
            Set<Integer> set = new HashSet<>();
            for (int i : nums) {
                if (i != val) {
                    set.add(i);
                    count++;
                }

            }
            int i = 0;
            for (int ans : set) {
                nums[i++] = ans;
                if (i > count) break;
            }
            // int x= nums.length-1;
            // for(int i=0;i<nums.length-1;i++){
            //     if(nums[i] == val){
            //         int temp = nums[i];
            //         nums[i] = nums[x];
            //         nums[x] = temp;
            //         x--;
            //     }
            //     if(nums[i] != val)  count++;
            // }
            return count;
        }
    }
}