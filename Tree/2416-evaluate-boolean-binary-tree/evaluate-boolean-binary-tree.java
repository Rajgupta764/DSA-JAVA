class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null){
            return (root.val==1)?true:false;
        }
        boolean left=false;
        boolean right=false;
        if(root.left!=null){
            left=evaluateTree(root.left);
        }
        if(root.right!=null){
            right=evaluateTree(root.right);
        }
        boolean result=false;
        if(root.val==2){
            return (left || right)?true:false;
        }
        if(root.val==3){
            return (left && right)?true:false;
        }
        return result;
    }

}