public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    static int result = 0;
    static int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return result;
    }
    
    public void helper(TreeNode root){
        if(root.left != null) helper(root.left);
        if(--count == 0){result = root.val; return;}
        if(root.right != null) helper(root.right);
    }
}
