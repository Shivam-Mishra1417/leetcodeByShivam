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
    public boolean isPalindrome(ListNode head) {
        String s = "";

        while(head!=null){
            s+= head.val;
            head = head.next;

        }
        //System.out.println("string = > "+s);
        int l = s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i) != s.charAt(l-1-i))
                return false;
        }
            return true;
    }
}