/*
Leetcode - 222. Count Complete Tree Nodes
According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
Design an algorithm that runs in less than O(n) time complexity.
*/
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int count = 0;
        TreeNode cur = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(cur);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            count++;
            if(temp.left != null) q.offer(temp.left);
            if(temp.right != null) q.offer(temp.right);
        }
        return count;
    }
    
}