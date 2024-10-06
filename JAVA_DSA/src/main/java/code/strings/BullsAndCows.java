//https://leetcode.com/problems/bulls-and-cows/description/?envType=problem-list-v2&envId=counting&difficulty=MEDIUM

package code.strings;

import java.util.ArrayList;
import java.util.List;

public class BullsAndCows {
    class Solution {
        public String getHint(String secret, String guess) {
            List<Character> list = new ArrayList<>();
            char[] s = secret.toCharArray();
            char[] g = guess.toCharArray();
            int bulls = 0, cows = 0;
            for (int i = 0; i < g.length; i++) {
                if (g[i] == s[i]) {
                    bulls++;
                    g[i] = 'a';

                } else {
                    list.add(s[i]);
                }
            }
            for (int j = 0; j < g.length; j++) {
                if (list.contains(g[j])) {
                    cows++;
                    list.remove(Character.valueOf(g[j]));
                }
            }
            return (bulls + "A" + cows + "B");
        }
    }
}
