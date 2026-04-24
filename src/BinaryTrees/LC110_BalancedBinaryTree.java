package BinaryTrees;

public class LC110_BalancedBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    // Returns -1 if unbalanced, otherwise returns height
    static int check(TreeNode node) {
        if (node == null) return 0;

        int left = check(node.left);
        if (left == -1) return -1;

        int right = check(node.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }

    static boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    void main() {
        // Balanced tree:    3
        //                  / \
        //                 9  20
        //                   /  \
        //                  15   7
        TreeNode balanced = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        // Unbalanced tree:  1
        //                  /
        //                 2
        //                /
        //               3
        TreeNode unbalanced = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null
        );

        System.out.println("Balanced: " + isBalanced(balanced));
        System.out.println("Unbalanced: " + isBalanced(unbalanced));
    }
}