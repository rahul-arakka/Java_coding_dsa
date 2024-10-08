//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//Note that multiple kids can have the greatest number of candies.

package code.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> res = new ArrayList<>();
            int max = 0;
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] > max) {
                    max = candies[i];
                }
            }
            for (int j = 0; j < candies.length; j++) {
                if (candies[j] + extraCandies >= max) {
                    res.add(true);
                } else
                    res.add(false);
            }

            return res;
        }
    }
}
