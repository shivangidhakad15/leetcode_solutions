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
    int sum = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
        return 0;
      Map<Long, Integer> map = new HashMap<>();
      map.put((long)0, 1);
      dfs(root, targetSum, map, (long)0);
      return sum; 
  }
    public void dfs(TreeNode root, int target, Map<Long, Integer> map, long current) {
      if (root == null)
        return; 
      current = current + root.val;
      if (map.containsKey(current - target)) {
        sum += map.get(current - target);
      }
      map.put(current, map.getOrDefault(current, 0) + 1);
      if (root.left != null)
        dfs(root.left, target, map, current);
      if (root.right != null)
        dfs(root.right, target, map, current); 
        map.put(current, map.get(current) - 1);
    }
}