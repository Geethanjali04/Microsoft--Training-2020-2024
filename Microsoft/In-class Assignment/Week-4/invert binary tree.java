class Solution {
    public TreeNode invertTree(TreeNode root) { 
        swap(root);
        return root;
         
    } 
    public void swap(TreeNode curr)
    {
        if(curr==null)
        {
            return;
        } 
        swap(curr.left);
        swap(curr.right);
        TreeNode temp;
        temp=curr.left;
        curr.left=curr.right;
        curr.right=temp;
    }
}
