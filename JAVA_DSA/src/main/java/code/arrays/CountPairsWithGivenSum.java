//https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions
//Count pairs with given sum
//Given an array arr, and an integer k, find the number of pairs of elements in the array whose sum is k.

package code.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    int getPairsCount(int[] arr, int sum) {
        // code here
//        int pairs=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i] + arr[j] == sum){
//                    pairs++;
//                }
//            }
//        }
//        return pairs;

        //Optimized version
        // Initialize count of pairs
        int pairs = 0;

        // Map to store frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            // Calculate the complement required to reach the sum
            int complement = sum - arr[i];

            // If complement exists in the map, it means we have found pairs
            if (frequencyMap.containsKey(complement)) {
                pairs += frequencyMap.get(complement);
            }

            // Update the frequency of the current element in the map
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        // Return the total count of pairs
        return pairs;


    }
}