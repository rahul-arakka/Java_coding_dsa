package code.arrays;

public class PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {

            int n = digits.length;
            if (digits[n - 1] != 9) {
                digits[n - 1]++;
                return digits;
            }
            boolean flag = true;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    flag = false;
                    break;
                }
            }
            int[] res = new int[n + 1];
            if (flag) {

                res[0] = 1;
                for (int j = 0; j < n; j++) {
                    res[j + 1] = digits[j];
                }
            } else return digits;
            return res;
        }
    }
}
