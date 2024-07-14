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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        //System.out.println(Arrays.toString(nums)+"\n"+st);

        ListNode ans = head, curr=head,prev=null;


        while(curr!=null){
            //System.out.println(curr.val+"  "+curr.next);
            if(st.contains(curr.val)){
                if(prev==null){
                    curr = curr.next;
                    ans=curr;
                }
                else{
                    prev.next = curr.next;
                    curr  = curr.next;
                }
            }
            else{
                prev = curr;
                curr = curr.next;
            }

        }

        ListNode tmp = ans;
        while(tmp!=null){
            System.out.print(tmp.val+" - ");
            tmp = tmp.next;
        }


    return ans;

    }
}