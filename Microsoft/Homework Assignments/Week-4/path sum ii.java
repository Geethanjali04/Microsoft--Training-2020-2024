class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) { 
        List<List<Integer>>res=new ArrayList<>();
        path(root,targetSum,new ArrayList(),res);
        return res;
    } 
    public void path(TreeNode root,int sum,List<Integer>path,List<List<Integer>>res)
    {
        if(root==null)
        {
            return ;
        } 
        path.add(root.val);
        if(root.left==null && root.right==null && root.val==sum)
        {
            res.add(path);
        } 
        path(root.left,sum-root.val,new ArrayList(path),res);
        path(root.right,sum-root.val,new ArrayList(path),res); 
       
    }
    }
