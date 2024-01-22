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
    List<Integer> list = new ArrayList<>();
    public int maxLevelSum(TreeNode root) {
        helper(root,0);
        int max = list.get(0) , level = 1;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
                level = i+1;
            }
        }
        return level;
    }
    public void helper(TreeNode root , int level){
        if(root == null) return;
        if(list.size() <= level) list.add(root.val);
        else{
            list.set(level , list.get(level)+root.val);
        }
        helper(root.right , level+1);
        helper(root.left , level+1);
    }
}