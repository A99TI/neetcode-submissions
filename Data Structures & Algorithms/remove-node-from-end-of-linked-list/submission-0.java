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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode ahead = dummy.next;

        for (int i = 0; i < n; i++){
            ahead = ahead.next;
        }

        while (ahead != null){
            pre = pre.next;
            ahead = ahead.next;
        }

        ListNode next = pre.next.next; 
        pre.next = next;

        return dummy.next;

    }
}
