class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
        {
            return head;
        } 
        int n=0;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next; 
            n++;
        }  
        temp.next=head;
        k=k%(n+1);
        int jump=(n-k);
        temp=head;
        while(jump>0)
        {
            temp=temp.next;
            jump--;
        } 
        ListNode reshead=temp.next;
        temp.next=null;
        return reshead;
        
        
        
    }
}
