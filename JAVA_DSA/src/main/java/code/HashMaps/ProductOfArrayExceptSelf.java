//https://30dayscoding.com/dsa
//https://leetcode.com/problems/product-of-array-except-self/
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.

package code.HashMaps;
class Solution {

//    Solution with division operation used
//    public int[] productExceptSelf(int[] nums) {
//        int[] res = new int[nums.length];
//        int countZero = 0, indexZero = -1, sum = 1;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                nums[i] = 1;
//                countZero++;
//                indexZero = i;
//            }
//
//            sum *= nums[i];
//        }
//
//        if (countZero > 0) {
//            for (int i = 0; i < nums.length; i++) {
//                res[i] = 0;
//            }
//        } else {
//            for (int j = 0; j < nums.length; j++) {
//                res[j] = sum / nums[j];
//            }
//        }
//        if (indexZero != -1 && countZero == 1)
//            res[indexZero] = sum;
//
//        return res;


//     int lsum = 1, rsum = 1;
//     for(int i=0;i<nums.length;i++){
//         res[i] = lsum;
//         lsum *= nums[i];
//     }
//     for(int i=nums.length-1;i>=0;i--){
//         res[i] *= rsum;
//         rsum *= nums[i];
//     }
//
//     return res;
List<Integer> arr1 = new ArrayList<>();
    List<Integer> arr2 = new ArrayList<>();

    int n = nums.length;
    int product = 1;

    // Calculate prefix products
        for (int i = 0; i < n; i++) {
        arr1.add(product);
        product *= nums[i];
    }

    product = 1;

    // Calculate suffix products and final product array
        for (int i = n - 1; i >= 0; i--) {
        arr2.add(arr1.get(i) * product);
        product *= nums[i];
    }

        Collections.reverse(arr2);

    int[] resultArray = new int[arr2.size()];

    // Iterate over the ArrayList and populate the int[] array
        for (int i = 0; i < arr2.size(); i++) {
        resultArray[i] = arr2.get(i);
    }

        return resultArray;
    }
}