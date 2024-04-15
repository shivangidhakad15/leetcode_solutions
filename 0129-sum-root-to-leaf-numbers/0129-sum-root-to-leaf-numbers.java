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
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
    public static int sum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;

        if (root.left == null & root.right == null) {
            return sum;
        }
        return sum(root.left, sum) + sum(root.right, sum);
    }
}