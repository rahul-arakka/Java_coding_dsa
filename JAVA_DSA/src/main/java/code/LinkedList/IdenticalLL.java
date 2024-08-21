//https://www.geeksforgeeks.org/problems/identical-linked-lists/1?page=1&category=Linked%20List&difficulty=Basic&sortBy=submissions
//Given the two singly Linked Lists respectively. The task is to check whether two linked lists are identical or not.
//Two Linked Lists are identical when they have the same data and with the same arrangement too. If both Linked Lists are identical then return true otherwise return false.

package code.LinkedList;

public class IdenticalLL {
    class Solution {
        // Function to check whether two linked lists are identical or not.
        public boolean areIdentical(Node h1, Node h2) {
            // Node h1 = head1, h2 = head2;
            // write your code here
            while (h1 != null && h2 != null) {
                // System.out.println(" printing h1 :"+ h1.next.data +"  h2 : " + h2.next.data);
                if (h1.data != h2.data) {
                    return false;
                }
                h1 = h1.next;
                h2 = h2.next;
            }
            if (h1 != null || h2 != null)
                return false;
            return true;
        }
    }
}
