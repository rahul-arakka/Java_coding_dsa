//https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions
//Frequencies of Limited Range Array Elements
//Given an array arr[] of n positive integers which can contain integers from 1 to p where elements can be repeated or can be absent from the array.
//Your task is to count the frequency of all numbers from 1 to n. Do modify the array in-place changes in arr[], such that arr[i] = frequency(i) and assume 1-based indexing.

package code.arrays;

public class FrequencyOfArrayElements{
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        //Basic approach - 1.93 sec
        int[] a2 = new int[N];
        for(int i=0;i<N;i++){
            a2[i] = arr[i];
            arr[i] = 0;
        }

        for(int j=0;j<N;j++){
            if(a2[j] <= N){
                arr[a2[j]-1]++;
            }
        }

    }
}