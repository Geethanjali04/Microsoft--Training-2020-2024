class Solution {
    public Node copyRandomList(Node head) { 
        Node node=head;
        Map<Node,Node>map=new HashMap<>();
        if (head==null)
        {
            return null;
        } 
        while(node!=null)
        {
            map.put(node,new Node(node.val)); 
            node=node.next;
        }
        node =head;
         while(node!=null)
         {
             map.get(node).next=map.get(node.next);
             map.get(node).random=map.get(node.random);
             node=node.next;
         } 
        return map.get(head);
    }
}
