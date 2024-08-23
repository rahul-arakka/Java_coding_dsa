//https://leetcode.com/problems/palindrome-linked-list/description/
//Given the head of a singly linked list, return true if it is a palindromeor false otherwise.

// This approach works for all test cases.
// First we find the mid of the lindked list using slow and fast pointers.
// Then we start to reverse the linked list from mid to the end.
// Now we have the pointers head (having next in forward direction) & mid (having next in backward direction).
// we will start traversing and checking for the values, if at anytime values doesn't match we wil return false.

package code.LinkedList;

public class IsPalindrome {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head, fast = head, prev = null;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                // prev = slow;
            }
            ListNode mid = slow;
            while (mid != null) {
                ListNode temp = mid.next;
                mid.next = prev;
                prev = mid;
                mid = temp;
            }
            mid = prev;
            while (mid != null) {
                if (head.val != mid.val) {
                    return false;
                }
                head = head.next;
                mid = mid.next;
            }
            return true;
        }
    }
}
