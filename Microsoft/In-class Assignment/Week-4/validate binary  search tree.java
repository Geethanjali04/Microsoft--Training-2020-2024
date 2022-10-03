class Solution {
    public boolean isValidBST(TreeNode root) {  
        return validbst(root,Long.MIN_VALUE,Long.MAX_VALUE);
      
    } 
    public boolean validbst(TreeNode root,long minval,long maxval)
    {
        if(root==null) return true;
        if(root.val>=maxval || root.val<=minval)
        {
            return false;
        } 
        return validbst(root.left,minval,root.val) && validbst(root.right,root.val,maxval);
    }

}
