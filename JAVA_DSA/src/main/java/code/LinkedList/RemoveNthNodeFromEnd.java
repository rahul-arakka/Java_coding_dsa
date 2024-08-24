//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
//Given the head of a linked list, remove the nth node from the end of the list and return its head.

// This approach works for all test cases and runs with 0ms & beats 100%.

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
            if(size == n)   return head.next;
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
