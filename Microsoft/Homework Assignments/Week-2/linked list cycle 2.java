public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode slow=head,fast=head,target=head;
        int count=0;
        if(head==null || head.next==null)
        {
            return null;
        } 
        while(fast!=null && fast.next!=null)
        { 
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                count=1; 
                break;
            } 
            
        }  
        if(count==1)
        {
            while(target!=slow)
            {
                target=target.next;
                slow=slow.next; 
                
            } 
            return target;
        }
            
        return null;
    
        
    }
}
