//https://leetcode.com/problems/defuse-the-bomb/description/?envType=problem-list-v2&envId=sliding-window&difficulty=EASY
//You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.
//
//To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.
//
//If k > 0, replace the ith number with the sum of the next k numbers.
//If k < 0, replace the ith number with the sum of the previous k numbers.
//If k == 0, replace the ith number with 0.
//As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].
//
//Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!

package code.SlidingWindow;

public class DefuseTheBomb {
    class Solution {
        public int[] decrypt(int[] code, int k) {
            int n = code.length;
            int[] ans = new int[n];
            if (k == 0) {
                for (int i = 0; i < n; i++) {
                    ans[i] = 0;
                }
                return ans;
            } else if (k > 0) {
                for (int i = 0; i < n; i++) {
                    int sum = 0;
                    for (int j = i + 1; j <= i + k; j++) {
                        sum += code[j % n];
                    }
                    ans[i] = sum;
                }
            } else {
                for (int i = 0; i < n; i++) {
                    int sum = 0;
                    for (int j = i - 1; j >= i + k; j--) {
                        sum += code[(n + j) % n];
                    }
                    ans[i] = sum;
                }
            }
            return ans;

        }
    }
}
