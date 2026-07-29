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
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // If there is no left subtree,
        // the minimum depth must come from the right.
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If there is no right subtree,
        // the minimum depth must come from the left.
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // Both children exist.
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}