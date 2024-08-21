//https://www.geeksforgeeks.org/problems/print-linked-list-elements/1?page=1&category=Linked%20List&difficulty=Basic&sortBy=submissions
//Given a linked list. Print all the elements of the linked list separated by space followed.

package code.LinkedList;

public class PrintLinkedList {
    class Solution {
        void display(Node head) {
            // add code here.
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data + " ");
        }
    }
}
