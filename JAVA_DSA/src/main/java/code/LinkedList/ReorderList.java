//https://30dayscoding.com/dsa
//https://leetcode.com/problems/reorder-list/

//You are given the head of a singly linked-list. The list can be represented as:
//
//L0 → L1 → … → Ln - 1 → Ln
//Reorder the list to be on the following form:
//
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//You may not modify the values in the list's nodes. Only nodes themselves may be changed.

// brute force approach - hit and try - first attempt towards the problem, need to be enhanced.

package code.LinkedList;

public class ReorderList {
    class Solution {
        public void reorderList(ListNode head) {
            ListNode result = new ListNode(0), h3 = result;
            ListNode temp = head, slow = head, fast = head, prev = null;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = null;
            prev = slow;

            while (slow.next != null) {
                System.out.println("printing slow val : " + slow.val);
                ListNode t2 = slow.next;
                slow.next = prev;
                prev = slow;
                slow = t2;

            }
            ListNode t1 = head, t2 = slow;
            while (head.next != null && slow.next != null) {
                System.out.println("printing val: " + head.val + " slow val : " + slow.val);
                t1 = head.next;
                t2 = slow.next;
                head.next = t1;
                slow.next = t2;
                head = t1;
                slow = t2;
            }
            return;

        }
    }
}
