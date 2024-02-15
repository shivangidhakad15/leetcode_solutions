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
    int maxZigZag;
    void dfs(TreeNode root, int zig, int zigzag) {
        if(root == null)
            return;
        maxZigZag = Math.max(maxZigZag, zigzag);
        dfs(root.left, -1, 1 + ((zig == 1) ? zigzag : 0));
        dfs(root.right, 1, 1 + ((zig == -1) ? zigzag : 0));
    }
    public int longestZigZag(TreeNode root) {
        dfs(root, 0, 0);
        return maxZigZag;
        
    }
}