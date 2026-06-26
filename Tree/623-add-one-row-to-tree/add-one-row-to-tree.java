class Solution {
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        TreeNode newRoot=null;
        if(depth==1){
            newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }

        dfs(root,1,depth,val);
        return root;
        
    }
    public void dfs(TreeNode root,int currDepth,int depth,int val){
        if(root==null){
            return;
        }
        if(currDepth==depth-1){
            TreeNode newLeft=new TreeNode(val);
            newLeft.left=root.left;
            root.left=newLeft;
            TreeNode newRight=new TreeNode(val);
            newRight.right=root.right;
            root.right=newRight;
            return;
        }
        dfs(root.left,currDepth+1,depth,val);
        dfs(root.right,currDepth+1,depth,val);
    }
}