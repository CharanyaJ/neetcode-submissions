/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; 
 this.next = next; }
 * }
 */
 
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode();

        ListNode left = head;
        ListNode right = left.next;
        while(right.next != null){
            dummy=left;
            left = right;
            right = right.next;
            left.next=dummy;
        }
        head.next=null;
        right.next=left;
        head=right;
        return head;
    }
}
