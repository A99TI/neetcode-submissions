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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyOne = new ListNode(0);
        ListNode curr = dummyOne;

        int carry = 0;
        while (l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            curr.next = newNode;

            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while (l1 != null || l2 != null){
            int sum = 0;
            if (l1 != null){
                sum = l1.val + carry;
                l1 = l1.next;
            } else {
                sum = l2.val + carry;
                l2 = l2.next;
            } 
        
            int digit = sum % 10;
            carry = sum / 10;
            
            ListNode newNode = new ListNode(digit);
            curr.next = newNode;
            curr = curr.next;
        }

        System.out.println(carry);
        if (carry > 0){
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }

        return dummyOne.next;
    }
}
