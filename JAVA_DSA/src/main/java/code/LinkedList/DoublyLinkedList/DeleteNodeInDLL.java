package code.LinkedList.DoublyLinkedList;

public class DeleteNodeInDLL {
    class Solution {
        public DLLNode deleteNode(DLLNode head, int x) {
            if(x == 1){
                head = head.next;
                head.prev = null;
                return head;
            }
            DLLNode tmp = head;
            while(x-2 > 0){
                tmp = tmp.next;
                x--;
            }
            tmp.next = tmp.next.next;

            return head;
        }
    }
}
