//https://leetcode.com/problems/merge-nodes-in-between-zeros/description/
//You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.
//For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.
//Return the head of the modified linked list.

// This approach runs for all the test cases with 6 ms time and beats 27.11 %.

package code.LinkedList;

public class MergeNodesBtwnZeros {
    class Solution {
        public ListNode mergeNodes(ListNode head) {
            ListNode result = new ListNode();
            ListNode ans = result;
            int sum = 0;

            while (head != null) {
                if (head.val == 0 && sum != 0) {

                    ListNode temp = new ListNode(sum);
                    result.next = temp;
                    result = result.next;
                    sum = 0;


                } else {
                    sum += head.val;
                }
                head = head.next;
            }
            return ans.next;
        }
    }
}
