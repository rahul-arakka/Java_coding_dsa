//https://www.geeksforgeeks.org/problems/key-pair5616/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions
//Key Pair
//Given an array arr of positive integers and another number x. Determine whether or not two elements exist in arr whose sum is exactly x.

package code.arrays;

public class KeyPair {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x)
                    return true;
            }
        }
        return false;
    }
}