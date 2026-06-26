class Solution {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        pathSum(root,0);
        return sum;
    }
    public void pathSum(TreeNode root,int curr){
        if(root==null){
            return;
        }
        curr=curr*10+root.val;
        if(root.left==null && root.right==null){
              sum+=curr;
              return;
        }
        pathSum(root.left,curr);
        pathSum(root.right,curr);
    }
}