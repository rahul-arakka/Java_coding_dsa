//https://30dayscoding.com/dsa
//https://leetcode.com/problems/reorder-list/

//You are given the head of a singly linked-list. The list can be represented as:
//
//L0 → L1 → … → Ln - 1 → Ln
//Reorder the list to be on the following form:
//
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//You may not modify the values in the list's nodes. Only nodes themselves may be changed.

// This approach works for all test cases, we first traverse to the middle of LL using slow & fast pointers (with fast = head.next).
// Then reverse rest of the LL and then start pointing the next nodes accordingly.

package code.LinkedList;

public class ReorderList {
    class Solution {
        public void reorderList(ListNode head) {
            ListNode slow = head, fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode second = slow.next;
            ListNode prev = slow.next = null;

            while (second != null) {
                // System.out.println("printing slow val : "+ slow.val);
                ListNode t2 = second.next;
                second.next = prev;
                prev = second;
                second = t2;

            }
            // ListNode first;
            second = prev;
            while (second != null) {
                // System.out.println("printing val: "+ head.val +" slow val : "+ slow.val);
                ListNode t1 = head.next;
                ListNode t2 = second.next;
                head.next = second;
                second.next = t1;
                head = t1;
                second = t2;
            }
            return;

        }
    }
}
