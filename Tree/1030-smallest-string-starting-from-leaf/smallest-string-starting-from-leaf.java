class Solution {
    String smallestString="";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return smallestString;
    }
    public void dfs(TreeNode root, String currString){
        if(root==null){
            return;
        }
        currString=(char)('a'+root.val)+currString;
        if(root.left==null && root.right==null){
            if(smallestString=="" || smallestString.compareTo(currString)>0){
                smallestString=currString;
            }
            return;
        }
        //abc
        dfs(root.left,currString); //dabc
        //abc
        dfs(root.right,currString);
        //abc
    }
}