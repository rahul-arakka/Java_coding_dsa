//https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions
//Given a linked list where nodes can contain values 0s, 1s, and 2s only.
//The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to the head side, 2s at the end of the linked list, and 1s in the middle of 0s and 2s.

package code.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortALinkedList {
    class Solution {
        // Function to sort a linked list of 0s, 1s and 2s.
        static Node segregate(Node head) {
            Node temp = head;
            // add your code here
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.data);
                head = head.next;
            }
            head = temp;
            Collections.sort(list);
            for (int i : list) {
                // System.out.println(i);
                Node node = new Node(i);
                head.next = node;
                head = head.next;
            }
            return temp.next;
        }
    }
}
