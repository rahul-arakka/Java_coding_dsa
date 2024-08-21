package code.LinkedList;

public class MergeTwoSortedLL {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode sorted = new ListNode();
            ListNode temp = sorted;
            // System.out.println("printin l1 : "+ list1.next.val);
            while (list1 != null && list2 != null) {
                // System.out.println("printin l2 : "+ list2.next.val);
                if (list1.val <= list2.val) {
                    if (temp == null) temp = list1;
                    temp.next = list1;
                    list1 = list1.next;
                } else {
                    if (temp == null) temp = list2;
                    temp.next = list2;
                    list2 = list2.next;
                }
                temp = temp.next;

            }
            if (list1 != null) {
                temp.next = list1;
            } else {
                temp.next = list2;

            }

            return sorted.next;
        }
    }
}
