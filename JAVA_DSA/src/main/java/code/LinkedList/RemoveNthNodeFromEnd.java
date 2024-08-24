//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
//Given the head of a linked list, remove the nth node from the end of the list and return its head.


package code.LinkedList;

public class RemoveNthNodeFromEnd {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head.next == null) {
                return null;
            }
            ListNode temp = head, temp2 = head;
            int size = 0;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            size = size - n - 1;
            while (size > 0 && temp2 != null) {
                temp2 = temp2.next;
                size--;
            }
            if (temp2.next != null)
                temp2.next = temp2.next.next;

            return head;
        }
    }
}
