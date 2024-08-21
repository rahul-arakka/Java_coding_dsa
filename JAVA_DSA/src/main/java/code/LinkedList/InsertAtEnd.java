//https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1?page=1&category=Linked%20List&difficulty=Basic&sortBy=submissions
//Given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the modified Linked List.

package code.LinkedList;

//Node is defined as
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class InsertAtEnd {
    class Solution {
        // Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x) {
            // code here
            Node node = new Node(x);
            if (head == null) {
                return node;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;

            return head;
        }
    }
}
