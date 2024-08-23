//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/
//Given the head of a linked list head, in which each node contains an integer value.
//Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
//Return the linked list after insertion.
//The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

// This approach works for all the test cases with 22ms and beats 32.72%.

package code.LinkedList;

public class InsertGreatestCommonDivisor {
    class Solution {
        public ListNode insertGreatestCommonDivisors(ListNode head) {
            int div = 0;
            ListNode head2 = head;
            while (head.next != null) {
                int num = 0;
                if (head.val < head.next.val) {
                    num = head.val;
                } else {
                    num = head.next.val;
                }
                while (num > 0) {
                    if (head.val % num == 0 && head.next.val % num == 0) {
                        div = num;
                        break;
                    }
                    num--;
                }
                ListNode temp2 = new ListNode(div);
                ListNode temp3 = head.next; // The next 4 lines can also be wirtten as below
                head.next = temp2;
                temp2.next = temp3;
                head = temp3;

                // The above 4 lines can also be wirtten as below (without temp3 node)
//                temp2.next = head.next;
//                head.next = temp2;
//                head = temp2.next;
            }
            return head2;
        }
    }
}
