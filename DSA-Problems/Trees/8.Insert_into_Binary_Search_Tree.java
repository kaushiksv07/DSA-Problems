/*
Leetcode - 701. Insert into a Binary Search Tree
You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode cur = root;
        //deleteValueInNode(cur, key);
        return  deleteValueInNode(root, key);
    }
    public void deleteValueInNode(TreeNode node, int val){
        if(node == null){
            return;
        }
        if(((node.left != null && node.left.val == val) || (node.right != null && node.right.val == val))){
            if(node.left.val == val && node.left.left == null && node.left.right == null){
                node.left = null;
            }else if(node.right.val == val && node.right.left == null && node.right.right == null){
                node.right = null;
            }else if(node.left.val == val && node.left.left != null && node.left.right == null){
                node.left = node.left.left;
            }else if(node.left.val == val && node.left.left == null && node.left.right != null){
                node.left = node.left.right;
            }else if(node.right.val == val && node.right.left != null && node.right.right == null){
                node.right = node.right.left;
            }else if(node.right.val == val && node.right.left == null && node.right.right != null){
                node.right = node.left.right;
            }else{
                TreeNode temp = node.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                node.val = temp.val;
                deleteValueInNode(node.left, node.val);
            }
        }else{
            if(val > node.val){
                deleteValueInNode(node.right, val);
            }else{
                deleteValueInNode(node.left, val);
            }
        }
    }
}