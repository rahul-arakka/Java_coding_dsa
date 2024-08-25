package code.LinkedList.DoublyLinkedList;

import java.util.ArrayList;

public class FindPairsWithGivenSum {
    class Solution {
        public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, DLLNode head) {
            // code here
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            while (head.next != null) {

                DLLNode tmp = head.next;
                while (tmp != null) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    if (head.data + tmp.data == target) {
                        pair.add(head.data);
                        pair.add(tmp.data);
                        result.add(pair);
                    }
                    tmp = tmp.next;
                }

                head = head.next;
            }
            return result;
        }
    }


}
