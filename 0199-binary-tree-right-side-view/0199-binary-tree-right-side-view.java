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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        addByLevel(root, 0);
        return ans;
    }
    public void addByLevel(TreeNode node, int level) {
        if(node==null) return;
        if(ans.size() <= level) {
            ans.add(node.val);
        } else {
            ans.set(level, node.val);
        }
        addByLevel(node.left, level+1);
        addByLevel(node.right, level+1);   
    }
}