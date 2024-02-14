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
    int count = 0;
    public void countGoodNodes(TreeNode root, int maximum) {
            if(root!=null) {
                if (maximum <= root.val) {
                    maximum = root.val;
                    count++;
                }
            countGoodNodes(root.left,maximum);
            countGoodNodes(root.right, maximum);
        } 
    }
    public int goodNodes(TreeNode root) {
        int maximum = root.val;
        countGoodNodes(root,  maximum);
        return count;
    }
}