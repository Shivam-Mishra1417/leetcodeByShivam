/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int val = 0, carry = 0;
        ListNode ans = new ListNode(0);
        ListNode res=ans;
        while (l1 != null && l2!=null) {
           val = l1.val + l2.val + carry;
           carry = val/10;
           val = val%10;
           ans.next = new ListNode(val);
           ans = ans.next;
           l1 = l1.next;
           l2 = l2.next;
        }
        while (l2 != null) {
           val = l2.val + carry;
           carry = val/10;
           val = val%10;
           ans.next = new ListNode(val);
           ans=ans.next;
           l2 = l2.next;
        }

        while (l1 != null) {
           val = l1.val + carry;
           carry = val/10;
           val = val%10;
           ans.next = new ListNode(val);
           ans = ans.next;
           l1 = l1.next;
        }
        
        if(carry!=0) 
        ans.next = new ListNode(carry);
        
        return res.next;
    }
}