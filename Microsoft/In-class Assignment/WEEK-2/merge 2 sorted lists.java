class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode res=new ListNode(0); 
        ListNode head=res;
       
        if(list1==null && list2==null)
        {
            return null;
        } 
        if(list1==null)
        {
            return list2;
        } 
        if(list2==null)
        {
            return list1;
        }  
        while(list1!=null || list2!=null)
        {
            if((list1!=null && list2!=null && list1.val<=list2.val)|| list2==null)
            {
                head.next=list1;
                list1=list1.next;
                head=head.next;
            } 
            else 
            {
                head.next=list2;
                list2=list2.next;
                head=head.next;
            }
        } 
        return res.next;
 } 
}
