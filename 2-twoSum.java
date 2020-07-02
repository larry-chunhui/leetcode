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
        ListNode ls=new ListNode(0);
        ListNode head =ls;
        ListNode a=l1;
        ListNode b=l2;
        int carry=0;
       int x=0;
        int y=0;
        int cur;
        
        while(a!=null || b!=null){
             x=0;
             y=0;
            if(a!=null) {
                 x=a.val;
            }
            if(b!=null){
                y=b.val;
            }
            
            carry=carry+x+y;
            cur=carry%10;
            carry=carry/10;
            ls.next=new ListNode(cur);
            ls=ls.next;
            
            if(a!=null){a=a.next;}
            if(b!=null){b=b.next;}
        }
        if(carry>0){
            ls.next=new ListNode(carry);
        }
        
        return head.next;
       
        
    }
}