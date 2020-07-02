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
        int size=0;
        ListNode cur=head;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        cur=head;
        
        if((size-n)==0){
            head=head.next;
            return head;
        }
        else{
            for(int i=0;i<size-n-1; i++){
               cur=cur.next;
            }
            cur.next=cur.next.next;       
            return head;        
        }

    }
}