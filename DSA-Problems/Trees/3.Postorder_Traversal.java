/*
Leetcode 145. Binary Tree Postorder Traversal
Given the root of a binary tree, return the postorder traversal of its nodes' values.
*/
class Solution {
    List<Integer> result;
    public List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        traversePostOrder(root);
        return result;
    }
    public void traversePostOrder(TreeNode node){
        if(node == null) return;

        traversePostOrder(node.left);
        traversePostOrder(node.right);
        result.add(node.val);
    }
}