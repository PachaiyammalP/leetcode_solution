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
    public ListNode removeElements(ListNode head, int val) {
        ListNode h2=new ListNode(-1);
        h2.next=head;
        ListNode temp=h2;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
                
            }
            else{
                temp=temp.next;
            }
        }
        return h2.next;
    }
}