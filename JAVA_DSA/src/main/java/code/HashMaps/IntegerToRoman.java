//https://leetcode.com/problems/integer-to-roman/description/?envType=problem-list-v2&envId=hash-table
//Given an integer, convert it to a Roman numeral.

package code.HashMaps;

public class IntegerToRoman {
    class Solution {
        public String intToRoman(int num) {
            int[] place = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] value = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            int i = 0;
            String roman = "";
            while (num > 0) {
                if (num >= place[i]) {
                    roman += value[i];
                    num -= place[i];
                } else {
                    i++;
                }
            }
            return roman;
        }
    }
}
