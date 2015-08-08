public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
            
        if(Math.abs(max(root.left)-max(root.right))>1)
            return false;
            
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int max(TreeNode root){
        if(root == null)
            return 0;
            
        return 1 + Math.max(max(root.left), max(root.right));
    }
}
