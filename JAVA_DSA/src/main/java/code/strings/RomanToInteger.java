//https://leetcode.com/problems/roman-to-integer/
//Given a roman numeral, convert it to an integer.
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.



package code.strings;

public class RomanToInteger {
    class Solution {
        public int romanToInt(String s) {
            int roman = 0, res = 0, lastRom = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                switch (s.charAt(i)) {
                    case 'I' -> roman = 1;
                    case 'V' -> roman = 5;
                    case 'X' -> roman = 10;
                    case 'L' -> roman = 50;
                    case 'C' -> roman = 100;
                    case 'D' -> roman = 500;
                    case 'M' -> roman = 1000;
                }
                if (roman < lastRom) {
                    res -= roman;
                } else {
                    res += roman;
                }
                lastRom = roman;

            }
            return res;
        }
    }
}
