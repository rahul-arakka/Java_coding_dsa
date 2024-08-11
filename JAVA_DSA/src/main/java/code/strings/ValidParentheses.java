//https://leetcode.com/problems/valid-parentheses/
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
//determine if the input string is valid.
// Covering edge case when the closing parentheses are inserted first.

package code.strings;

public class ValidParentheses {

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] arr = s.toCharArray();
            for (char ch : arr) {
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if(stack.empty())   return false;
                    if (ch == ')' && stack.pop() != '(') {
                        return false;
                    } else if (ch == '}' && stack.pop() != '{') {
                        return false;
                    } else if (ch == ']' && stack.pop() != '[') {
                        return false;
                    }
                }
            }
//            System.out.println(" Printing stack: " + stack);
            if (!stack.empty())
                return false;
            return true;
        }
    }

}
