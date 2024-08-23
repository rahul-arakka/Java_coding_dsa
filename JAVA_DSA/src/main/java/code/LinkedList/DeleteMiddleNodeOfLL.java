//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
//You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
//The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

package code.LinkedList;

public class DeleteMiddleNodeOfLL {
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            ListNode slow = head, fast = head, prev = slow;
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = prev.next.next;
            return head;
        }
    }
}
