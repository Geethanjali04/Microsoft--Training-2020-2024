class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) { 

        ListNode current=head;
        ListNode prev=null;
        for (int i = 0; current!=null && i < left-1; i++) {
        prev=current;
        current=current.next;
        }
         ListNode last=prev;
         ListNode newend=current;
         ListNode nextt=current.next;
        for (int i = 0; current!=null && i < right-left+1; i++) {
        current.next=prev;
        prev=current;
        current=nextt;
        if(nextt!=null){
            nextt=nextt.next;
        }
    }
    if(last!=null){
        last.next=prev;
    }else{
        head=prev;
    }
    newend.next=current;
    
    return head;
  } 
} 

   
