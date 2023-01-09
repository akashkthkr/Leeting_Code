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
    List<Integer> preOrdAns =  new ArrayList<>();
    public void preOrdRecursion(TreeNode root) {
        if (root == null)
            return;
        preOrdAns.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrdRecursion(root);
        return preOrdAns;
    }
}