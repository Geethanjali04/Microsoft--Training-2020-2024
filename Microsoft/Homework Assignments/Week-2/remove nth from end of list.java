class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        int count = 0;
        ListNode curr=head;
        while(count<n){
            curr = curr.next;
            count++;
        }
        if(curr== null) return head.next;
        ListNode prev = head;
        
        while(curr.next != null) {
            prev=prev.next;
            curr=curr.next;
        }
        if(prev.next != null) {
            prev.next = prev.next.next;
        } 
        
        return head;
        
    }
}
   
