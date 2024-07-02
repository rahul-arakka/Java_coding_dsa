//https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions
//Count pairs with given sum
//Given an array arr, and an integer k, find the number of pairs of elements in the array whose sum is k.

package code.arrays;

public class CountPairsWithGivenSum {
    int getPairsCount(int[] arr, int sum) {
        // code here
        int pairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}