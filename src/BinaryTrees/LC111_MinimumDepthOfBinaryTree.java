package BinaryTrees;

public class LC111_MinimumDepthOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    /*
     * find shortest path from root to any leaf node
     * 1. if node is null, return 0
     * 2. if only one child exists, must go that direction (can't stop at null)
     * 3. otherwise return 1 + min of both subtree depths
     *
     * dfs recursion
     * O(n) time, O(h) space
     */
    static int minDepth(TreeNode root) {
        if (root == null)        return 0;
        if (root.left == null)   return 1 + minDepth(root.right);
        if (root.right == null)  return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    void main() {
        //       3
        //      / \
        //     9  20
        //        / \
        //       15   7
        TreeNode root1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        System.out.println(minDepth(root1)); // 2

        //   2
        //    \
        //     3
        //      \
        //       4
        TreeNode root2 = new TreeNode(2,
                null,
                new TreeNode(3, null, new TreeNode(4))
        );
        System.out.println(minDepth(root2)); // 3
    }
}