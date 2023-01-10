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
    private static boolean checkBothTreeNode(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        boolean flag = checkBothTreeNode(p.left, q.left);
        boolean flag2 = checkBothTreeNode(p.right, q.right);
        return flag&&flag2;
    }
    public boolean isSameTree(TreeNode a, TreeNode b) {
        return checkBothTreeNode(a, b);
    }
}