//https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1?page=1&category=Linked%20List&difficulty=Basic&sortBy=submissions
//Given the head of a Singly Linked List and a value x. The task is to insert the key in the middle of the linked list.

package code.LinkedList;

public class InsertInMiddle {
    class Solution {
        public Node insertInMiddle(Node head, int x) {
            // Code here
            Node node = new Node(x);
            if (head == null) return node;
            Node h1 = head, temp = head;
            int len = 0;
            while (h1 != null) {
                len++;
                h1 = h1.next;
            }
            int mid = (len + 1) / 2;
            while (mid - 1 > 0) {
                temp = temp.next;
                mid--;
            }
            node.next = temp.next;
            temp.next = node;
            // node. = node;
            return head;

        }
    }
}
