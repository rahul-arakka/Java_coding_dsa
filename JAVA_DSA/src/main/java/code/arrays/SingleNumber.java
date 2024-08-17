//https://leetcode.com/problems/single-number/description/
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

// This approach runs in linear time complexity O(nlogn + n) and constant space O(1);

package code.arrays;

public class SingleNumber {
    // Approach 1
    // Map<Integer,Integer> map = new HashMap<>();
    // for(int num : nums){
    //     map.put(num, map.getOrDefault(num, 0)+1);
    // }
    // for(Map.Entry ent : map.entrySet()){
    //     if((int)ent.getValue() == 1)
    //         return (int)ent.getKey();
    // }
    // return 0;

    // Approach 2
        Arrays.sort(nums);
    int i = 0, j = 1;
        while(i<nums.length &&j<nums.length)

    {
        if (nums[i] != nums[j])
            return nums[i];
        if (nums[i] == nums[j]) {
            i = j + 1;
            j = i + 1;
        }
    }
        return nums[i];

}
