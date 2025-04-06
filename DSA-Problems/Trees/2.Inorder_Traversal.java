/*
Leetcode 94. Binary Tree Inorder Traversal
Given the root of a binary tree, return the inorder traversal of its nodes' values.
*/


class Solution {
    List<Integer> arr;
    public List<Integer> inorderTraversal(TreeNode root) {
        arr = new ArrayList<>();
        travereInOrder(root);
        return arr;
    }
    public void travereInOrder(TreeNode node){
        if(node == null) return;
        travereInOrder(node.left);
        arr.add(node.val);
        travereInOrder(node.right);
    }
}