public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public int sumNumbers(TreeNode root) {
        return add(root, 0);
    }
    
    public int add(TreeNode root, int sum){
        if(root == null)
            return sum;
            
        int left = 0, right = 0;
        
        sum = root.val + (sum * 10);
        if(root.left == null && root.right == null)
            return sum;
        
        if(root.left != null) left = add(root.left, sum);
        if(root.right != null) right = add(root.right, sum);
        
        return left + right;
    }
}
