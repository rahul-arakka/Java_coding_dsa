//https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions
//Given the head of a linked list and the number k, Your task is to find the kth node from the end.
//If k is more than the number of nodes, then the output should be -1.

package code.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class KthFromEnd {
    class Solution {

        // Function to find the data of kth node from
        // the end of a linked list.
        int getKthFromLast(Node head, int k) {
            // Your code here
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.data);
                head = head.next;
            }
            if (k > list.size())
                return -1;

            return list.get(list.size() - k);
        }
    }
}
