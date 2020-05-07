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
class Node {
    int parent;
    int depth;
}

class Solution {

    Node xNode;
    Node yNode;

    public boolean isCousins(TreeNode root, int x, int y) {
        xNode = new Node();
        yNode = new Node();
        findCousins(root, x, y, 0, 1);

        return xNode.parent != yNode.parent && xNode.depth == yNode.depth;
    }

    public void findCousins(TreeNode root, int x, int y, int parent, int depth) {
        if (root == null)
            return;

        if (root.val == x) {
            xNode.parent = parent;
            xNode.depth = depth;
        }
        if (root.val == y) {
            yNode.parent = parent;
            yNode.depth = depth;
        }

        findCousins(root.left, x, y, root.val, depth + 1);
        findCousins(root.right, x, y, root.val, depth + 1);
    }
}