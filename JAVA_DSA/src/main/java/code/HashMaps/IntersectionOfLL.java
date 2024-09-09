package code.HashMaps;

import code.LinkedList.ListNode;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfLL {

//      Definition for singly-linked list.
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
      val = x;
      next = null;
      }
      }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Map<ListNode, Integer> map = new HashMap<>();
            while (headA != null) {
                map.put(headA, headA.val);
                headA = headA.next;
            }
            while (headB != null) {
                if (map.containsKey(headB)) {
                    return headB;
                }
                headB = headB.next;
            }
            return null;
        }
    }
}
