package BinaryTrees;

public class LC98_ValidateBST {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    static boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean dfs(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
    }

    void main() {
        //     2
        //    / \
        //   1   3
        TreeNode valid = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        //     5
        //    / \
        //   1   4
        //      / \
        //     3   6
        TreeNode invalid = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(4, new TreeNode(3), new TreeNode(6))
        );

        System.out.println("Valid   : " + isValidBST(valid));   // true
        System.out.println("Invalid : " + isValidBST(invalid)); // false
    }
}
