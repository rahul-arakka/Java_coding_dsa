//https://leetcode.com/problems/linked-list-cycle/
//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.

//This approach works in all cases, maintaining 2 pointer 1 slow : will run by only 1 step at a time and 2 fast: run 2 steps at a time.
//If there is any loop exists then these pointers will definetly meet at some common point.

package code.LinkedList;

public class LinkedListCycle {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head, fast = head;
            while (slow != null && fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }

            }
            return false;
        }
    }
}
