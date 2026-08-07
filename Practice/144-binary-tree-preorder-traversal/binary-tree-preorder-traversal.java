class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
    private void dfs(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.val);  //root value
        dfs(root.left,ans); //left subtree
        dfs(root.right,ans);  //right subtree
    }
}