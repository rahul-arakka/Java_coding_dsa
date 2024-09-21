//https://leetcode.com/problems/to-lower-case/description/?envType=problem-list-v2&envId=string&difficulty=EASY
//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

package code.strings.ToLowerCase;

public class ToLowerCase {
    class Solution {
        public String toLowerCase(String s) {
            // Approach 1
//            Simplicity: It uses simple string operations that might be easier to understand for beginners.
//                    Cons:
//            Inefficiency: String concatenation in Java creates a new string each time, leading to increased time complexity (O(n^2) in the worst case). This is because each concatenation creates a new string object and copies the old content.
//            Multiple passes: Each concatenation requires creating a new string, which is more costly in terms of performance.
//            String ans = "";
//            for (int i = 0; i < s.length(); i++) {
//                char ch = s.charAt(i);
//                if (ch >= 65 && ch <= 90) {
//                    ch += 32;
//                }
//                ans += String.valueOf(ch);
//
//            }
//            return ans;

            // We can simply return the value using in-built method ".toLowerCase" as below and it will take 0ms & beats 100%.
//            return s.toLowerCase();

            //Approach 2
//            This approacch work with 0ms and beats 100%
//            Pros:
//            Efficiency: This approach uses a character array, which allows for direct manipulation of characters. This is generally more efficient than string concatenation.
//            Single pass: The transformation of characters happens in one loop, directly modifying the array.
//                    Cons:
//            Memory allocation: It creates an additional array, which could be slightly more memory-intensive for very large strings compared to appending to a StringBuilder.
            char arr[]=s.toCharArray();

            for(int i=0; i<s.length(); i++)
            {
                if(arr[i]>='A' && arr[i]<='Z')
                    arr[i]=(char)(arr[i]+32);
            }

            return (String.valueOf(arr));

        }
    }
}
