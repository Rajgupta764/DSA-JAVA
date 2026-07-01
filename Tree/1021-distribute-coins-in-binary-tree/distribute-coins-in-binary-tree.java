class Solution {
    int moves;
    public int distributeCoins(TreeNode root) {
        moves=0;
        dfs(root);
        return moves;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftmoves=dfs(root.left);
        int rightmoves=dfs(root.right);
        root.val=leftmoves+rightmoves+(root.val-1);
        moves+=Math.abs(root.val);
        return root.val;
    }
}