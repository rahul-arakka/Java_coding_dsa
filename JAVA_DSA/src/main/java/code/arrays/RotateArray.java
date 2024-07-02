package code.arrays;


//https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions

//Given an unsorted array arr[] of size n.
// Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer.

public class RotateArray {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {


        int[] a2 = new int[d];
        d = d%n;
        for(int i=0;i<d;i++){
            a2[i] = arr[i];
        }
        for(int j=d;j<n;j++){
            arr[j-d] = arr[j];
        }
        int x=0;
        for(int i=n-d;i<n;i++){
            arr[i] = a2[x];
            x++;
        }

    }
}
