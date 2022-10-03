class Solution {
    public TreeNode deleteNode(TreeNode root, int key) { 
        if (root == null)
            return null;
        
        if (root.val == key) {
            
            if (root.left == null && root.right == null)
                root = null;
            
            else if (root.left == null)
                root = root.right;
            
            else if (root.right == null)
                root = root.left;
            
            else if (root.left != null && root.right != null) {
                TreeNode temp = root.left;
                while (temp.right != null)
                    temp = temp.right;
                temp.right = root.right;
                root = root.left;
            }
        }
        else if (root.val < key)
            root.right = deleteNode(root.right, key);
        else
            root.left = deleteNode(root.left, key);
        return root;
    }
}
    
    
