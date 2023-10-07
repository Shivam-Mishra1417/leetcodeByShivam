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
        List<ListNode> lt = new ArrayList<ListNode>();
        ListNode res=head;

        while(head!=null){
            lt.add(head);
            head = head.next;
        }
        if(n> lt.size())
        return null;
        if(n== lt.size())
        return (res.next==null)?null:res.next;
        else{
            int l = lt.size()-1;
            System.out.println(l+" "+n);
            System.out.println(lt.toString());
            if(l-n>=0 && l-n+2<=l)
            lt.get(l-n).next = lt.get(l-(n-2));
            if(l-n<0) return null;
            if(l-n+2>l && l-n>=0)
            lt.get(l-n).next = null;
            return res;
        }
    }
}