//https://www.geeksforgeeks.org/problems/modular-node/1?page=1&category=Linked%20List&difficulty=Basic&sortBy=submissions
//Given the head of a Singly Linked List and a number k, the task is to find the modular node of the linked list. If no such index is present return -1.
//A modular node is defined as the last node in the linked list whose index is divisible by k (i%k==0).

//Note: 1-based indexing is followed.

package code.LinkedList;

public class ModularNode {
    class Solution {
        public int modularNode(Node head, int k) {
            // Code here//Position this line where user code will be pasted.
            int val = -1, x = 1;
            while (head != null) {
                if (x % k == 0) {
                    val = head.data;
                }
                head = head.next;
                x++;
            }
            return val;
        }
    }
}
