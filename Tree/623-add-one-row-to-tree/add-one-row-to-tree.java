class Solution {
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        TreeNode newRoot=null;
        if(depth==1){
            newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }

        Queue<TreeNode> pq=new LinkedList<>();
        pq.add(root);
        int currDepth=1;
        while(!pq.isEmpty()){
            int size=pq.size();
            for(int i=0;i<size;i++){
                TreeNode current=pq.poll();
                if(currDepth==depth-1){
                    TreeNode newLeft=new TreeNode(val);
                    newLeft.left=current.left;
                    current.left=newLeft;
                    TreeNode newRight=new TreeNode(val);
                    newRight.right=current.right;
                    current.right=newRight;

                } else{
                    if(current.left!=null){
                        pq.add(current.left);
                    }
                    if(current.right!=null){
                        pq.add(current.right);
                    }
                }
                
            }
            currDepth++;
        }
        return root;
    }
}