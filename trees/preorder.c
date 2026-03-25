#include <stdlib.h>
#include <stdio.h>


struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};
 
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void helper(struct TreeNode* root, int* result, int* index) {
    if (root == NULL) return;
    
    result[(*index)++] = root->val;       // root
    helper(root->left, result, index);    // left
    helper(root->right, result, index);   // right
}

int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    int* result = (int*)malloc(1000 * sizeof(int));
    *returnSize = 0;
    
    helper(root, result, returnSize);  
    
    return result;
}