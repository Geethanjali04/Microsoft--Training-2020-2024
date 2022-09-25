class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy; 
        while(temp.next!=null && temp.next.next!=null)
        {
            ListNode a=temp.next;
            ListNode  b=temp.next.next;
            a.next=b.next;
            b.next=a;
            temp.next=b;
            temp=b.next;
            
        } 
        return dummy.next;
    }
}
