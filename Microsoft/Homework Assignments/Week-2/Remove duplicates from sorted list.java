class Solution {
    public ListNode deleteDuplicates(ListNode head) { 
        ListNode prev=head;
        ListNode temp=head; 
        if(head==null)
        {
            return head;
        }
        while(temp!=null)
        { 
            if(prev.val==temp.val )
            {    
                if(temp.next!=null)
                {
                temp=temp.next; 
                } 
                else 
                {
                    prev.next=null; 
                    temp=temp.next;
                }
            } 
            else 
            {
                prev.next=temp;
                prev=temp;
                temp=temp.next;
            } 
            
        }
        return head;
    }
}
