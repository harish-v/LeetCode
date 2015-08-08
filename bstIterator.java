public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class BSTIterator {

    static Stack<TreeNode> stack= new Stack<>();
    public BSTIterator(TreeNode root) {
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode top = stack.pop();
        
        if(top.right != null){
            TreeNode root = top.right;
            while(root != null){
                stack.push(root);
                root = root.left;
            }
        }
        
        return top.val;
    }
}
