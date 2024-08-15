//Given two binary strings a and b, return their sum as a binary string.

package code.strings;

public class AddBinary {
    class Solution {
        public String addBinary(String x, String y) {
//            int num1 = Integer.parseInt(a, 2);
//            int num2 = Integer.parseInt(b, 2);
//            int res = num1 + num2;
//            return Integer.toBinaryString(res);
            int i = x.length() - 1, j = y.length() - 1;
            int carry = 0;
            StringBuilder result = new StringBuilder();
            while (i >= 0 || j >= 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += x.charAt(i) - '0';
                }
                if (j >= 0) {
                    sum += y.charAt(j) - '0';
                }
                if (sum == 0 || sum == 1) {
                    result.append(sum);
                    carry = 0;
                } else if (sum == 2) {
                    result.append("0");
                    carry = 1;
                } else {
                    result.append("1");
                    carry = 1;
                }
                i--;
                j--;
            }
            if (carry == 1) {
                result.append("1");
            }
            return result.reverse().toString();

        }
    }
}
