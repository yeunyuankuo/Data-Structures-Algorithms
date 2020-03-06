package Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinarySearchTreeIterator {
    // Time complexity = O(1)
    // Space complexity = O(h); h: depth of the tree
    private Stack<TreeNode> stack;

    public BinarySearchTreeIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();
        inOrder(root);
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode nextMin = this.stack.pop();
        if (nextMin.right != null) {
            inOrder(nextMin.right);
        }
        return nextMin.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return this.stack.size() > 0;
    }

    private void inOrder(TreeNode root) {
        while (root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }
}
