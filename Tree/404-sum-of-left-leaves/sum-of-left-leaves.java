
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return getSum(root,false);
    }

    public int getSum(TreeNode root,boolean isLeft){
        if(root.left==null && root.right==null){
            return (isLeft)?root.val:0;
        }
        int sum=0;
        if(root.left!=null){
            sum+=getSum(root.left,true);
        }
        if(root.right!=null){
            sum+=getSum(root.right,false);
        }
        return sum;
    }
}