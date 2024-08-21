//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
//Return the linked list sorted as well.

//we have to make a valid check while using "while" loop for linked list.
// As sometimes the head value could be null (here the null means node doesn't exists) and throws error like: cannot read parameter... because it does not exist till now.
// Hence we should put the condition to check current node(head) value is null or not, instead of checking head.next;


package code.LinkedList;

public class RemoveDuplicateFromSortedLL {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode res = head;
            // System.out.print(head.val);
            while (head != null) {
                if (head.next != null) {
                    if (head.val == head.next.val) {
                        head.next = head.next.next;
                    } else
                        head = head.next;
                } else {
                    break;
                }
            }
            return res;
        }
    }
}
