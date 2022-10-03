class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length)
            return null;
        Map<Integer,Integer>map= new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }
    TreeNode build(int[] inorder,int is,int ie,int[] postorder,int ps,int pe,Map<Integer,Integer>map){
        if(is>ie || ps>pe)
            return null;
        TreeNode root= new TreeNode(postorder[pe]);
        int inRoot=map.get(postorder[pe]);
        int left=inRoot-is;
        root.left=build(inorder,is,inRoot-1,postorder,ps,ps+left-1,map);
        root.right=build(inorder,inRoot+1,ie,postorder,ps+left,pe-1,map);
        return root;
    }
}
