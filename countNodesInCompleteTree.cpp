struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    int countNodes(TreeNode* root) {
        if(root == NULL)
            return 0;
            
        int left = getHeight(root->left);
        int right = getHeight(root->right);
        
        if(left == right){
            return (int)pow(2, left) + countNodes(root->right);
        }else{
            return (int)pow(2, right) + countNodes(root->left);
        }
    }
    
    int getHeight(TreeNode* root){
        int count = 0;
        while(root != NULL){
            count++;
            root = root->left;
        }
        
        return count;
    }
};
