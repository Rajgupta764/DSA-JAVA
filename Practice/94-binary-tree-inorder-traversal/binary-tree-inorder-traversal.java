class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
    private void dfs(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        dfs(root.left,ans);  //left subtree
        ans.add(root.val);   //root value
        dfs(root.right,ans);  //right subtree
    }
}