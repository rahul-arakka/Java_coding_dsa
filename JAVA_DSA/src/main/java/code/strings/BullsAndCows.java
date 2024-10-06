//https://leetcode.com/problems/bulls-and-cows/description/?envType=problem-list-v2&envId=counting&difficulty=MEDIUM

package code.strings;

import java.util.ArrayList;
import java.util.List;

public class BullsAndCows {
    class Solution {
        public String getHint(String secret, String guess) {
            int bulls = 0;
            int cows = 0;
            int[] numbers = new int[10];
            for (int i = 0; i < secret.length(); i++) {
                if (secret.charAt(i) == guess.charAt(i)) bulls++;
                else {
                    if (numbers[secret.charAt(i) - '0']++ < 0) cows++;
                    if (numbers[guess.charAt(i) - '0']-- > 0) cows++;
                }
            }
            return bulls + "A" + cows + "B";
        }
    }
}
