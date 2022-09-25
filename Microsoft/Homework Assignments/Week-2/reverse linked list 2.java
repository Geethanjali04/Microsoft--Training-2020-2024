
   class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) { 
        ListNode res=new ListNode(0);
        res.next=head;
        ListNode curr=ptr; 
        int count=1;
        if(left==right)
        {
            return head;
        }
        while(curr!=null && count<left)
        {
            curr=curr.next;  
            count++;
            
        }  
        ListNode start=curr.next;
        curr=curr.next;
        ListNode prev=null;  
        while(count<=right)
        { 
            next=curr.next;
            curr.next=prev; 
            prev=curr;
            curr=next;
            count++;
         }
            start.next.next=curr;
            start.next=prev;
         
        return res.next;
    } 
    
}
