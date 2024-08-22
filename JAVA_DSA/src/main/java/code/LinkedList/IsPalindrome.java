//https://leetcode.com/problems/palindrome-linked-list/description/
//Given the head of a singly linked list, return true if it is a palindromeor false otherwise.

// This approach works only for sample test cases.

package code.LinkedList;

public class IsPalindrome {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode reverse = head, prev = null;

            while (reverse != null) {
                ListNode temp = reverse.next;
                reverse.next = prev;
                prev = reverse;
                reverse = temp;
            }
            // reverse = reverse.next;
            // reverse = prev;
            while (head != null && prev != null) {
//                System.out.println("head.val : " + head.val + " prev.val :" + prev.val);
                if (head.val != prev.val) {
                    return false;
                }
                head = head.next;
                prev = prev.next;
            }
            return true;
        }
    }
}
