//https://leetcode.com/problems/sort-list/description/
//Given the head of a linked list, return the list after sorting it in ascending order.

// We are using MERGE SORT algorithm here to sort the linkedlist in O(nlog n) time complexity.
// We first break the ll in two part by finding the middle element using slow and fast pointer, then making the middle's next value to be null for that we can just iterate till that middle element (as we are putting the check for node null).
// At each level we are breaking the same list in two part until we found only single/last head/node.
// In Merge function we will be comparing these two lists at each node and add minimum value to the new list.
// we are taking two pointers here one points to the head of new LL created and other will iterate to the LL.
// At every recursive call we will return this head node -  just similar to what we do in Merge sort for arrays, etc.

package code.LinkedList;

public class SortLinkedList {
    class Solution {
        public ListNode merge(ListNode h1, ListNode h2) {
            ListNode res = new ListNode(0), ans = res;

            while (h1 != null && h2 != null) {
                if (h1.val < h2.val) {
                    res.next = h1;
                    h1 = h1.next;
                } else {
                    res.next = h2;
                    h2 = h2.next;
                }
                res = res.next;
            }
            if (h1 != null) {
                res.next = h1;
            }
            if (h2 != null) {
                res.next = h2;
            }
            return ans.next;
        }

        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode slow = head, fast = head, prev = null;
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = null;
            ListNode h1 = sortList(head);
            ListNode h2 = sortList(slow);

            return merge(h1, h2);
        }
    }
}
