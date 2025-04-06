/*
Leetcode - 144. Binary Tree Preorder Traversal
Given the root of a binary tree, return the preorder traversal of its nodes' values.
*/
import java.util.*;

class Solution {
    List<Integer> result;
    
    public List<Integer> preorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        traversePreorder(root);
        return result;
    }
    
    public void traversePreorder(TreeNode node) {
        if (node == null) {
            return;
        }
        result.add(node.val);   // Visit the root node
        traversePreorder(node.left);  // Traverse left subtree
        traversePreorder(node.right); // Traverse right subtree
    }
}
