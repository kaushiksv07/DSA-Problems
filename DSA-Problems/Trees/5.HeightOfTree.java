/*
Leetcode - 104. Maximum Depth of Binary Tree
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/
class Solution {
    public int maxDepth(TreeNode root) {
        return heightOfBST(root, 0);
    }
    public int heightOfBST(TreeNode node, int height){
        if(node == null){
            return height;
        }
        int leftDepth = heightOfBST(node.left, height+1);
        int rightDepth = heightOfBST(node.right, height+1);
        return Math.max(leftDepth, rightDepth);
    }
}