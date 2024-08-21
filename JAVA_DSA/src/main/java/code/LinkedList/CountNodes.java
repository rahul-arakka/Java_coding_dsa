//https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1?page=1&category=Linked%20List&difficulty=Basic&sortBy=submissions
//Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

package code.LinkedList;

public class CountNodes {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int len = 1;
        if(head == null){
            return 0;
        }
        while(head.next != null){
            head = head.next;
            len++;
        }
        return len;
    }

}

