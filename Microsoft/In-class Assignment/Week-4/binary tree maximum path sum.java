class Solution {
    public int maxPathSum(TreeNode root) { 
        int maxval[]=new int[1];
        maxval[0]=Integer.MIN_VALUE; 
        maxpathdown(root,maxval);
        return maxval[0];
         } 
    public int maxpathdown(TreeNode root,int[]maxval)
    {  
        if(root==null)
        {
            return 0;
        }
        int left=Math.max(0,maxpathdown(root.left,maxval)); 
        int right=Math.max(0,maxpathdown(root.right,maxval));
        maxval[0]=Math.max(maxval[0],(left+right+root.val)); 
        return Math.max(left,right)+root.val;
        
        
    }
}
