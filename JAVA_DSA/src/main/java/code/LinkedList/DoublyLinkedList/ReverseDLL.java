package code.LinkedList.DoublyLinkedList;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class ReverseDLL {


    class Solution {
        public DLLNode reverseDLL(DLLNode head) {
            // Your code here
            DLLNode tail = head;
            while (head != null) {
                DLLNode tmp = head.next;
                head.next = head.prev;
                tail = head;
                head = tmp;
            }

            return tail;
        }
    }
}
