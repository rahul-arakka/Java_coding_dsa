//https://leetcode.com/problems/fizz-buzz/description/
//Given an integer n, return a string array answer (1-indexed) where:

//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i (as a string) if none of the above conditions are true.


package code.Math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> answer = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        answer.add("FizzBuzz");
                    } else answer.add("Fizz");
                } else if (i % 5 == 0) {
                    answer.add("Buzz");
                } else {
                    answer.add(i + "");
                }
            }
            return answer;
        }
    }
}
