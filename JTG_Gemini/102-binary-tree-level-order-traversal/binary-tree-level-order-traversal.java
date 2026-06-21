
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> pq=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        pq.add(root);
        while(!pq.isEmpty()){
            int size=pq.size();
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current=pq.poll();
                li.add(current.val);
                if(current.left!=null) pq.add(current.left);
                if(current.right!=null) pq.add(current.right);
            }
            ans.add(li);
        }
        return ans;
    }
}