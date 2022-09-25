class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp.next!=null) 
        {
            temp=temp.next;
            count++;
        } 
        if(count==0)
        {
            return null;
        }
        int jump=count-n;  
        temp=head; 
        if(jump==-1)
        {
          head=head.next; 
        }
        while(jump>0)
        {
            temp=temp.next; 
            jump--;
        } 
        ListNode next=temp.next.next;
        if(next==null)
        {
            temp.next=null;
        }
        temp.next=next; 
        
        return head;
    } 
}
   
