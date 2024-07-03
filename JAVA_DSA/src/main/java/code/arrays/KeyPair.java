//https://www.geeksforgeeks.org/problems/key-pair5616/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions
//Key Pair
//Given an array arr of positive integers and another number x. Determine whether or not two elements exist in arr whose sum is exactly x.

package code.arrays;

public class KeyPair {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        // Basic approach - 0.9 sec
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x)
                    return true;
            }
        }
        return false;


        // Time Taken is longer in below approach  - 1.51 sec

        // Arrays.sort(arr);
        // int index = arr.length;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] > x){
        //         index = i;
        //         break;
        //     }
        // }

        // for(int i=0;i<index-1;i++){
        //     for(int j=i+1;j<index;j++){
        //         if(arr[i] + arr[j] == x){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }