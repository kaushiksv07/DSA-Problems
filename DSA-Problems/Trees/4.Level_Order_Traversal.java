/*
Leetcode - 102. Binary Tree Level Order Traversal
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
*/
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode curr = root;
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>(); 
        q.offer(curr);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> smallAns = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                smallAns.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            result.add(smallAns);
        }
        return result;
    }
}