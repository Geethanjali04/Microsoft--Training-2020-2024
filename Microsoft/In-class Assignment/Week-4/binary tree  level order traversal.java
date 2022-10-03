class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) { 
        
        
       
        List<List<Integer>>res=new LinkedList<List<Integer>>();    
         Queue<TreeNode>q=new LinkedList<>(); 
        if(root==null)
        {
            return res;
        } 
        q.add(root); 
        while(!q.isEmpty())
        {  
            int qsize=q.size();
            List<Integer>sublist=new LinkedList<>(); 
            for(int i=0;i<qsize;i++)
            {  
                TreeNode qele=q.remove();
                if(qele.left!=null)
                {
                    q.add(qele.left);
                } 
                if(qele.right!=null)
                {
                    q.add(qele.right);
                } 
                sublist.add(qele.val);
            }   
            res.add(sublist);
            
        } 
        return res;
    }
}
