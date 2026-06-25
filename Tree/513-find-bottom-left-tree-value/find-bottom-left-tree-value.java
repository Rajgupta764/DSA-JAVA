class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> pq=new LinkedList<>();
        pq.add(root);
        TreeNode prev=null;
        while(!pq.isEmpty()){
            TreeNode current=pq.poll();
            if(current.right!=null) pq.add(current.right);
            if(current.left!=null) pq.add(current.left);
            prev=current;
        }
        return prev.val;
        
    }
}