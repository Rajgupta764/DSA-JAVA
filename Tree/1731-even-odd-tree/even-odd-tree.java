class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> pq=new LinkedList<>();
        boolean even=true;
        pq.add(root);
        while(!pq.isEmpty()){
            int prev=(even)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            int size=pq.size();
            for(int i=0;i<size;i++){
                TreeNode current=pq.poll();
                int values=current.val;
                if((even && (values%2==0 || values<=prev)) || (!even && (values%2!=0 || values>=prev))){
                    return false;
                }
                prev=values;
                if(current.left!=null) pq.add(current.left);
                if(current.right!=null) pq.add(current.right);
                
            }
            even=!even;
        }
        return true;
    }
}