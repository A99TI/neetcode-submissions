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
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode curr = new ListNode();
        ListNode head = curr;

        if (p1 == null && p2 == null) return null;
        if (p1 == null) return p2;
        if (p2 == null) return p1;

        while (p1 != null || p2 != null){
            if (p1 != null && p1.val <= p2.val){
                curr.next = p1;
                curr = p1;
                p1 = p1.next;
            } else {
                curr.next = p2;
                curr = p2;
                p2 = p2.next;
            }   
            curr.next = null;
        }


        return head.next;

        
    }
}