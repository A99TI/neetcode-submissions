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

        ListNode dummy = new ListNode();
        
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode p3 = dummy;

        while (p1 != null && p2 != null){
            ListNode newNode;
            if (p1.val <= p2.val){
                newNode = p1;
                p1 = p1.next;
                
            } else{
                newNode = p2;
                p2 = p2.next;
            }

            newNode.next = null;
            p3.next = newNode;
            p3 = p3.next;
        }

        if (p2 !=null){
            p3.next = p2;
        }
        if (p1 !=null){
            p3.next = p1;
        }

        return dummy.next;

    }
}