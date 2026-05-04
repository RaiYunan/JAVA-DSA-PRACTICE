package BinaryTrees;

public class LC101_SymmetricTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    static boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }

    static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val)
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }

    void main() {
        // Symmetric:      1
        //                / \
        //               2   2
        //              / \ / \
        //             3  4 4  3
        TreeNode symmetric = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );

        // Asymmetric:     1
        //                / \
        //               2   2
        //                \   \
        //                 3   3
        TreeNode asymmetric = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3))
        );

        System.out.println("Symmetric : " + isSymmetric(symmetric));  // true
        System.out.println("Asymmetric: " + isSymmetric(asymmetric)); // false
    }
}