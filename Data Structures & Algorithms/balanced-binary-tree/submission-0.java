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
    private static class Result {
        boolean isBalanced;
        int height;
        Result(boolean isBalanced, int height){
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }
    public boolean isBalanced(TreeNode root){
        return dfs(root).isBalanced;
    }

    public Result dfs(TreeNode node){
        if(node==null) return new Result(true, 0);

        Result left = dfs(node.left);
        Result right = dfs(node.right);

        Boolean balanced = left.isBalanced && right.isBalanced && Math.abs(left.height-right.height)<=1;

        return new Result(balanced, 1+Math.max(left.height, right.height));

    }
}
