/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return list1;
        }
        if (list1 != null && list2 == null) {
            return list1;
        }
        if (list1 == null && list2 != null) {
            return list2;
        }
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode head = new ListNode(0);
        ListNode current = head;
        int i = 0;
        while (l1 != null && l2 != null) {
            ListNode prev;
            if (l1.val <= l2.val) {
                prev = l1;
                l1 = l1.next;

            } else {
                prev = l2;
                l2 = l2.next;
            }
            current.next = prev;
            current = current.next;
        }
        if (l1 == null)
            current.next = l2;
        if (l2 == null)
            current.next = l1;
        return head.next;
    }
}