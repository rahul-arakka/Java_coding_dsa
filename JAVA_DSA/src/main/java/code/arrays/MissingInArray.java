//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays&difficulty=Easy&status=solved&sortBy=submissions
// GFG : Missing in Array

package code.arrays;

import java.util.Arrays;

public class MissingInArray {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        Arrays.sort(arr);
        int num = arr[0];
        // System.out.println(arr[n-2]);
        if(arr[0] != 1) return 1;
        if(arr[n-2] != n) return n;
        for(int i=0;i<n-1;i++){
            if(arr[i] != num){
                return num;
            }
            num++;
        }
        return 0;
    }
}
