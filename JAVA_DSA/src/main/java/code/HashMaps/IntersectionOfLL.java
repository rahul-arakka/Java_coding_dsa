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
            // Map<ListNode, Integer> map = new HashMap<>();
//            List<ListNode> list = new ArrayList<>();
            while(headA != null){
                ListNode tmp = headB;
                while(tmp != null){
                    if(tmp == headA){
                        return tmp;
                    }
                    tmp = tmp.next;
                }
                headA = headA.next;
            }

            return null;
        }
    }
}
