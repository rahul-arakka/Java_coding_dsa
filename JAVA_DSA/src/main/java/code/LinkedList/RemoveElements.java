//https://leetcode.com/problems/remove-linked-list-elements/description/
//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

package code.LinkedList;

public class RemoveElements {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode temp = head, prev = null;
            while (temp != null) {
                if (temp.val == val) {
                    if (prev == null) {
                        head = temp.next;
                    } else {
                        prev.next = temp.next;
                    }
                } else {
                    prev = temp;
                }
                temp = temp.next;
            }
            return head;
        }
    }
}
