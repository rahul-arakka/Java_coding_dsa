//Given two binary strings a and b, return their sum as a binary string.
//This approach is valid for only limit length string values


        package code.strings;

public class AddBinary {
    class Solution {
        public String addBinary(String a, String b) {
            int num1 = Integer.parseInt(a, 2);
            int num2 = Integer.parseInt(b, 2);
            int res = num1 + num2;
            return Integer.toBinaryString(res);
        }
    }
}
