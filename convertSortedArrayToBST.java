public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
            
        return modify(nums, 0, nums.length-1);
    }
    
    public TreeNode modify(int[]nums, int start, int end){
        if(start > end){
            return null;
        }
        
        int mid = start + (end - start)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = modify(nums, start, mid-1);
        root.right = modify(nums, mid+1, end);
        
        return root;
    }
}
