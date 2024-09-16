//https://leetcode.com/problems/assign-cookies/submissions/1392438126/?envType=problem-list-v2&envId=two-pointers&difficulty=EASY
//Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
//
//Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.


package code.twoPointers;

public class AssignCookies {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            int i = 0, j = 0;
            int count = 0;
            Arrays.sort(g);
            Arrays.sort(s);
            while (i < g.length && j < s.length) {
                if (s[j] < g[i]) {
                    j++;
                } else {
                    j++;
                    i++;
                    count++;
                }

            }
            return count;
        }
    }
}
