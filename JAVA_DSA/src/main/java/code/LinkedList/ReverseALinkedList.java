//https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions
//Given the head of a linked list, the task is to reverse this list and return the reversed head.

//https://leetcode.com/problems/reverse-linked-list/description/

package code.LinkedList;

public class ReverseALinkedList {
    class Solution {
        // Function to reverse a linked list.
        Node reverseList(Node head) {
            // code here
            Node prev = null;
            while (head != null) {
                Node temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
            }
            return prev;
        }
    }
}
