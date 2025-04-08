/*
Leetocode - 543. Diameter of Binary Tree
Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.
*/
class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int height = returnDiameterOfTree(root, 0);
        return diameter;
    }
    public int returnDiameterOfTree(TreeNode node,int height){
        if(node == null){
            return 0;
        }
        int leftDepth = returnDiameterOfTree(node.left, height+1);
        int rightDepth = returnDiameterOfTree(node.right, height+1);
        diameter = Math.max(diameter, leftDepth+rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}