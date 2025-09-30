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
        // Dummy head to simplify list construction
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        int carry = 0;
        
        // Traverse both lists until both are null
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0; // value from l1 or 0
            int y = (l2 != null) ? l2.val : 0; // value from l2 or 0
            
            int sum = x + y + carry; // add digits and carry
            carry = sum / 10;        // update carry
            
            current.next = new ListNode(sum % 10); // create new node for current digit
            current = current.next;
            
            if (l1 != null) l1 = l1.next; // move to next node
            if (l2 != null) l2 = l2.next;
        }
        
        // If carry remains, add a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummyHead.next; // return actual head of resulting list
    }
}

