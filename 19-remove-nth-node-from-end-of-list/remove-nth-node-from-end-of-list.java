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
        ListNode fast = head ; 
        ListNode slow = head ; 
        for(int i=1;i<=n ; i++){
            if(fast!=null) fast = fast.next ; 
        }
        if(fast== null && fast!=slow) {
            slow = slow.next;
            return slow;
        }
        while(fast.next!=null){
            fast = fast.next; 
            slow = slow.next;
        }
        ListNode tmp = slow.next; 
        slow.next = tmp.next; 
        tmp.next = null;

        return head;

        }
}