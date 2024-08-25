//https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1?page=1&category=doubly-linked-list&difficulty=Easy&sortBy=submissions
//Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum is equal to given value target.

// This is optimized than the previous approach, here we are removing the nodes for which we already checked the sum to reduce the traversal.

package code.LinkedList.DoublyLinkedList;

import java.util.ArrayList;

public class FindPairsWithGivenSum {
    class Solution {
        public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, DLLNode head) {
            // code here
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            while (head != null) {

                DLLNode tmp = head.next;
                while (tmp != null) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    if (head.data + tmp.data == target) {
                        pair.add(head.data);
                        pair.add(tmp.data);
                        result.add(pair);


                        if (tmp.next != null) {
                            tmp.prev.next = tmp.next;
                            tmp.next.prev = tmp.prev;
                        } else {
                            tmp.prev.next = null;
                            tmp.next = null;

                        }


                    }
                    tmp = tmp.next;
                }

                head = head.next;
            }
            return result;
        }
    }
}
