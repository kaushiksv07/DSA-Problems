/*
Leetcode - 230. Kth Smallest Element in a BST
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
*/
class Solution {
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        return kse(root);
    }
    public int kse(TreeNode node){
        if(node == null) return -1;

        int leftVal = kse(node.left);
        
        count--;
        
        if(count == 0) return node.val;
        
        if(leftVal != -1) return leftVal;
        
        return kse(node.right);
    }
}